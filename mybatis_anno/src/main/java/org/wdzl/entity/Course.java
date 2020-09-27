package org.wdzl.entity;

import java.io.Serializable;
import java.util.List;
public class Course implements Serializable {

    /**
     * 课程实体类
     */

        private Integer cid;
        private String cname;
        //课程-->学⽣的多对多关系 将多的⼀⽅以集合的形式作为当前类的成员属性
        private List<Student> students;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
//省略了getter、setter、tostring⽅法

}
