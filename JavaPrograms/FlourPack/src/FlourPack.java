public class FlourPack {

    public static void main(String[] args) {
        System.out.println("canpack?" + canPack(0,5,4));

    }

    public static boolean canPack(int bigCount, int smallCnt, int goal){
        if (bigCount < 0 || smallCnt < 0 || goal < 0)
            return false;

        int remainder = 0;
        for (int i = bigCount; i > 0; i--){
            remainder = goal - (5 * i);
            //System.out.println("remander= " + remainder);
            if  ( remainder == 0)
                return true;
            else if (remainder > 0)
                break;

        }
        if (remainder > 0 && remainder <= smallCnt)
            return true;
        else if ( remainder <= 0 && smallCnt >= goal)
            return true;
        else
            return false;

    }
}
