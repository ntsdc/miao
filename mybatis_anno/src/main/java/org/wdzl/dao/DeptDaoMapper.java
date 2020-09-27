package org.wdzl.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.wdzl.entity.Dept;

import java.util.List;
@CacheNamespace(blocking = true)//二级缓存开启
public interface DeptDaoMapper {
    //dept持久化层
    @Select("select * from dept")
    @Results(id = "deptMap" ,value = {
            @Result(id = true,column = "dno",property = "dno"),
            @Result(column = "dname",property = "dname"),
            @Result(column = "dno",property = "emps",
                    many = @Many(select = "org.wdzl.dao.EmpDaoMapper.findEmpByDno",fetchType = FetchType.LAZY))
    })
    List<Dept>  findDeptAll();

    @Select("select * from dept where dno=#{dno}")
    Dept findDeptByDno(int dno);
}
