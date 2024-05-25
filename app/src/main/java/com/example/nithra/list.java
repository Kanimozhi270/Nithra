package com.example.nithra;

public class list {

    private String employee_code;
    private String name;

    public list(String employee_code, String name, String team, String designation, String dob, String joining, String mobile) {
        this.employee_code = employee_code;
        this.name = name;
        this.team = team;
        this.designation = designation;
        this.dob = dob;
        this.joining = joining;
        this.mobile = mobile;
        this.firstapp = firstapp;
    }

    private String team;
    private String designation;
    private String dob;
    private String joining;
    private String mobile;
    private String firstapp;

    public list() {

    }

    public String getEmployee_code() {
        return employee_code;
    }

    public void setEmployee_code(String employee_code) {
        this.employee_code = employee_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJoining() {
        return joining;
    }

    public void setJoining(String joining) {
        this.joining = joining;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFirstapp() {
        return firstapp;
    }

    public void setFirstapp(String firstapp) {
        this.firstapp = firstapp;
    }
}
