package com.davidschrik;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, true);

        printer1.printPages(49);
        System.out.println("number of pages printed " + printer1.getNumPagesPrinted()
        + ", toner Level is: " + printer1.getTonerLevel());

        printer1.printPages(45);

        printer1.addToner(75);

        printer1.printPages(40);
    }
}
