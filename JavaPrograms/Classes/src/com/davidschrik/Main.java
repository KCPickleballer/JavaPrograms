package com.davidschrik;

public class Main {
    public static void main(String[] args) {
//        Car porche = new Car();
//        porche.setModel("Porche");
//        System.out.println("model is " + porche.getModel());

//        Bank cust1 = new Bank();
//        cust1.setAcctNum("12345");
//        cust1.setBalance(1000.00);
//        cust1.setCustName("Dave");
//
//        boolean withdrawOk = cust1.makeWithdraw(900.00);
//        System.out.println("new balance is: " + cust1.getBalance());
//
//        withdrawOk = cust1.makeWithdraw(900.00);
//        if (withdrawOk != true)
//            System.out.println("Insufficient funds!" );

        VipCustomer dude = new VipCustomer("Dave",100000);
        System.out.println("daves credit limit: "+ dude.getCreditLimit());
    }

}
