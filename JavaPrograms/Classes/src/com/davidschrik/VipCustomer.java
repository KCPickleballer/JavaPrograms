package com.davidschrik;

public class VipCustomer {
    private String custName;
    private double creditLimit;
    private String eMail;

    public VipCustomer() {
        this.custName = "Default";
        this.creditLimit = 10000;
        this.eMail = "Default";
    }

    public VipCustomer(){
        this("dude", 1000, "default.com");
    }

    public VipCustomer(String custName, double creditLimit, String eMail){
        this.custName = custName;
        this.creditLimit = creditLimit;
        this.eMail = eMail;

    }

    public VipCustomer(String custName, double creditLimit) {
        this(custName, creditLimit, "default.Email");

    }

    public String getCustName() {
        return custName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String geteMail() {
        return eMail;
    }
}
