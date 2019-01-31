public class BarkingDog {

    public static void main(String[] args) {

        boolean wakeUp = bark(false, 23);
        System.out.println("wakeUp = " + wakeUp);
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean wakeUp = false;

        if ( barking && hourOfDay >= 0 && (hourOfDay < 8 || hourOfDay > 22))
            wakeUp = true;

        return (wakeUp);
    }
}
