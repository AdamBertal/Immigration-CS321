package com1;

public class FormDataTest {
    String name = "";
    String DOB = "";
    String address = "";

    int greenCardNumber = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGreenCardNumber(int greenCardNumber) {
        this.greenCardNumber = greenCardNumber;
    }

    public int getGreenCardNumber(){
        return greenCardNumber;
    }

    public FormDataTest(String name, String DOB, String address) {
        this.name = name;
        this.DOB = DOB;
        this.address = address;
    }




}
