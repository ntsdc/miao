package org.wdzl.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.wdzl.entity.Dept;
import org.wdzl.entity.Emp;

import java.util.List;

@CacheNamespace(blocking = true)

public interface EmpDaoMapper {

    @Select("select * from emp where dno=#{dno}")
    List<Emp> findEmpByDno(int dno);

    @Select("select * from emp")
    @Results(id = "empMap" ,value = {
            @Result(id = true,column = "eno",property = "eno"),
            @Result(column = "email",property = "email"),
            @Result(column = "salary",property = "salary"),
            @Result(column = "dno",property = "dno"),
            @Result(column = "dno" ,property="dept",
            one=@One(select = "org.wdzl.dao.DeptDaoMapper.findDeptByDno",fetchType = FetchType.LAZY))
    })



    List<Emp> findAllEmp();

}



    //多对一 查询所有雇员信息并级联查询对应的部门信息（按需加载） 多对一
    //雇员实体类配置与dept表的多对一关联关系   创建接口 查询所有雇员的方法
    //在查询注解上采用注解多对一关系  同时配置延迟加载策略  检查【配置mybatis-xml

    // 查询所有学员信息 并级联查询所选修的课程信息（按需加载） 多对多
    // 查询所有课程信息 并级联查询选择课程的学生

    //学员对应学生卡信息 一对一  学号--卡外键
    // 一对多√

    //123230209o9iie02
    //emp dept 增删改查 注解版和小毛驴版


