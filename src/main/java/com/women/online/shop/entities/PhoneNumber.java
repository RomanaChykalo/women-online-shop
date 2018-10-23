package com.women.online.shop.entities;

public class PhoneNumber {
    private String mobilePhone;
    private String workingPhone;
    private String homePhone;

    PhoneNumber(String mobilePhone, String workingPhone, String homePhone) {
        this.mobilePhone = mobilePhone;
        this.workingPhone = workingPhone;
        this.homePhone = homePhone;
    }

    public String toString() {
        return "mobile phone: " + mobilePhone + ", working number: " + workingPhone + ", home number: " + homePhone;
    }

    public String getMobilePhone() {return mobilePhone; }

    public String getWorkingPhone() {
        return workingPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

}