package com.davidschrik;

public class Printer {
    private int tonerLevel;
    private int numPagesPrinted;
    private boolean isDuplex;
    private int totPagesPrinted;

    public Printer(int tonerLevel,  boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numPagesPrinted = 0;
        this.isDuplex = isDuplex;
        this.totPagesPrinted= 0;
    }

    public void addToner(int toner){
        this.numPagesPrinted = 0;
        if (toner + this.tonerLevel > 100) {
            System.out.println("too much toner added ");
            this.tonerLevel = 100;
        } else
            this.tonerLevel += toner;
        System.out.println("toner added.");
    }

    public void printPages(int pagesToPrint){

        for (int i = 1; i <= pagesToPrint; i++ ){
            //assumes one tonerLevel per page
            if (this.tonerLevel  <= 0){
                System.out.println("out of toner, " + (i - 1) + " pages printed" );
                break;
            } else {
                this.numPagesPrinted++;
                this.tonerLevel--;
                this.totPagesPrinted++;
            }
        }
        System.out.println(pagesToPrint + " pages printed");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumPagesPrinted() {
        return numPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
