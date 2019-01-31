public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 2,3);
    }


    public static void printEqual(int valOne, int valTwo, int valThree){
        String outMsg = "Invalid Value";

        if (valOne < 0 || valTwo < 0 || valThree < 0)
            outMsg = "Invalid Value";
        else if (valOne == valTwo && valTwo == valThree)
            outMsg = "All values are equal";
        else if (valOne != valTwo && valOne != valThree && valTwo != valThree)
            outMsg = "All values are different";
        else
            outMsg = "Neither all are equal or different";

        System.out.println(outMsg);


    }
}
