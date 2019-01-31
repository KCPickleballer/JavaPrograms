public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println("sum of first and last 252 = " + sumFirstAndLastDigit(252));
        System.out.println("sum of first and last 5= " + sumFirstAndLastDigit(5));
        System.out.println("sum of first and last -10= " + sumFirstAndLastDigit(-1));

    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;

        int firstDigit = number % 10;
        int secondDigit = 0;

        while (number > 0){
             secondDigit = number % 10;
             number /= 10;

        }
        return (firstDigit + secondDigit);


    }
}
