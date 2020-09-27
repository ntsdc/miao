package org.wdzl.entity;

import org.wdzl.entity.Course;

import java.io.Serializable;
import java.util.List;

/**
 * 学⽣实体类
 6.3.3 在持久层添加查询所有学员信息
 6.3.4 在sql映射⽂件中配置
 6.3.5 测试
 */
public class Student implements Serializable {
    private Integer sid;
    private String sname;
    private Integer sage;
    private String semail;
    private String saddress;
    //学⽣-->课程的多对多关系
    private List<Course> courses;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourse(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", semail='" + semail + '\'' +
                ", saddress='" + saddress + '\'' +
                ", courses=" + courses +
                '}';
    }

    //省略了getter、setter、tostring⽅法
}
