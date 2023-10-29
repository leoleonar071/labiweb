package com.example.lab6iweb.beans;

import java.util.Date;

public class DeptManager {
    private int emp_no;
    private char dept_no;
    private Date from_Date;
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

    public Date getFrom_Date() {
        return from_Date;
    }

    public void setFrom_Date(Date from_Date) {
        this.from_Date = from_Date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }
}
