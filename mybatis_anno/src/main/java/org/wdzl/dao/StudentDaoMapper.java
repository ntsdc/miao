package org.wdzl.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.wdzl.entity.Student;

import java.util.List;
@CacheNamespace(blocking = true)
public interface StudentDaoMapper {//select s.*,c.* from student s left join student_course sc on s.sid = sc.sid left join course c on sc.cid = c.cid
    @Select("select s.*,c.* from student s left join student_course sc on s.sid = sc.sid left join course c on sc.cid = c.cid")
    @Results(id = "empMap" ,value = {
            @Result(id = true,column = "sid",property = "sname"),
            @Result(column = "sname",property = "sname"),
            @Result(column = "sage",property = "sage"),
            @Result(column = "semail",property = "semail"),
            @Result(column = "saddress",property = "saddress"),
            @Result(column = "cid" ,property = "course",
            many = @Many(select = "org.wdzl.dao.CourseDaoMapper.findCoursesByCid",fetchType = FetchType.LAZY))
    })
    List<Student> findAllStudent();
}
