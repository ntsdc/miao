package org.wdzl.entity;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable {
    private  Integer dno;
    private  String dname;

    //配置部门-->雇员  一对多关联关系
    private List<Emp> emps;

    public Dept(){

    }

    public Dept(Integer dno, String dname) {
        this.dno = dno;
        this.dname = dname;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dno=" + dno +
                ", dname='" + dname + '\'' +
                ", emps=" + emps +
                '}';
    }
}
