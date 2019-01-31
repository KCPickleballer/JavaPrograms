public class DecimalComparator {
    public static void main(String[] args) {
        boolean areEqual = areEqualByThreeDecimalPlaces(-3.1756, -3.176);
        System.out.println("areEqual " + areEqual);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        boolean areEqual = false;

        int firstInt = (int) (firstNum * 1000);
        int secondInt  = (int) (secondNum * 1000);

        if (firstInt == secondInt)
            areEqual = true;

                System.out.println("firstInt " + firstInt + " secondInt " + secondInt);

        return (areEqual);

    }
}
