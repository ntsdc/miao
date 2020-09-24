package org.wdzl.entity;

public class Emp {
    private Integer eno;
    private String ename;
    private String email;
    private Double salary;
    private Integer dno;

    public Emp(){}

    public Emp(Integer eno, String ename, String email, Double salary, Integer dno) {
        this.eno = eno;
        this.ename = ename;
        this.email = email;
        this.salary = salary;
        this.dno = dno;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", dno=" + dno +
                '}';
    }
}
