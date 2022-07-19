package com.example.qlsvandroid;

import android.provider.ContactsContract;

public class Student {
    String MSSV;

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    String name;
    String email;
    String dob;
    public Student(String mssv, String Name, String Email,String DOB){
        MSSV = mssv;
        name = Name;
        email = Email;
        dob = DOB;
    }

}
