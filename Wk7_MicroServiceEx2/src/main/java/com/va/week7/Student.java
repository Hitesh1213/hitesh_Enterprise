package com.va.week7;

public class Student {

    private int studentID;
    private String fname;
    private String lname;
    private String phone;
    private String dob;
    private String street;
    private String city;
    private String no;

    public Student() {}

    public Student(int studentID, String fname, String lname, String phone, String dob, String street, String city, String no) {
        this.studentID = studentID;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.dob = dob;
        this.street = street;
        this.city = city;
        this.no = no;
    }

    // Getters and Setters

    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone +
                ", dob=" + dob + ", street=" + street + ", city=" + city + ", no=" + no + "]";
    }
}