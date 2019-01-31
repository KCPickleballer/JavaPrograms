public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("the sum of the digits = " + sumDigits(125));


    }

    public static int sumDigits(int numIn){
        if (numIn < 10)
                return -1;

        int sumOut = 0;

        while (numIn > 0) {
            sumOut += (numIn % 10);
            numIn = numIn / 10;


        }
        return sumOut;


    }

}
