package com.example.lab6iweb.beans;

import java.util.Date;

public class DeptEmp {
    private int emp_no;
    private char dept_no;
    private Date from_date;
    private Date to_date;

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public char getDept_no() {
        return dept_no;
    }

    public void setDept_no(char dept_no) {
        this.dept_no = dept_no;
    }

    public Date getFrom_date() {
        return from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }
}
