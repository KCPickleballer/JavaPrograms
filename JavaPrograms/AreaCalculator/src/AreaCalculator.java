public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println("area of a circle " + area(5.0));

    }

    public static double area(double radius){
        if (radius < 0)
            return -1.0;
        else {
             double areaCircle = radius * radiusp * 3.14;
             return areaCircle;
        }

    }

    public static double area(double sideOne, double sideTwo){
        if (sideOne < 0 || sideTwo < 0)
            return -1.0;
        else {
            double areaRec = sideOne * sideTwo;
            return areaRec;
        }

    }
}
