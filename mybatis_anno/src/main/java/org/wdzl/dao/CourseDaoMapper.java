package org.wdzl.dao;

import org.apache.ibatis.annotations.Select;
import org.wdzl.entity.Course;
import org.wdzl.entity.Student;

import java.util.List;

public interface CourseDaoMapper {
@Select("select * from course where cid=#{cid}")
    List<Course> findCoursesByCid(int cid);

@Select("select * from course")
List<Course> findAllCourses();

}
