package com.DavidSchrik;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByteVar = 10;
        short myShortVar = 20;
        int myIntVar = 50;
        long myLongVar = 50000L + 10L * (myByteVar + myShortVar + myIntVar);
        System.out.println("myLong = " + myLongVar);
        float myFloatVal = 5f;
        double myDoubleVal = 5d;
        System.out.println("flt " + myFloatVal );
        System.out.println("dou " + myDoubleVal);

        double pndVal = 200d;
        double kiloVal = pndVal * .45359237d;
        System.out.println("3 pnd be kilo " + kiloVal);
        char myChar = '\u00AE';
        System.out.println("char " + myChar);
        boolean isAnAlien = false;
        if (isAnAlien)
            System.out.println("is an alien");
        double firstVal = 20;
        double secondVal = 40;
        double sumVal =( firstVal + secondVal) * 25 ;
        double remVal = sumVal % 25;
        if (remVal <= 20)
        System.out.println("it is 20 or less " + remVal);


    }
}
