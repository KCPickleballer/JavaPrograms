package com.davidschrik;

public class Bank {

    private String acctNum;
    private double balance;
    private String custName;
    private String eMail;
    private String phoneNum;


    public void setAcctNum(String acctNum){
        this.acctNum = acctNum;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustName(String custName){
        this.custName = custName;
    }
    public void seteMail( String eMail ){
        this.eMail = eMail;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

    public String getAcctNum(){
        return this.acctNum;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustName(){
        return this.custName;
    }
    public String getPhoneNum(){
        return this.phoneNum;
    }
    public void makeDeposit(double deposit){
        this.balance += deposit;
    }
    public boolean makeWithdraw(double withdraw){
        if (withdraw <= this.balance){
            this.balance -= withdraw;
            return true;
        } else
            return false;

    }


}
