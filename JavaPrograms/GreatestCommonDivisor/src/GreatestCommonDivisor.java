public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println("greatest common " + getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor( int first, int second){
        if (first < 10 || second < 10 )
            return -1;
        int loopCnt = 0;
        int greatesCommon = 0;
        if (first < second) {
            loopCnt = first;
        } else loopCnt = first;

        for (int i=1; i<= loopCnt; i++){
            if ((first % i ==0) && (second % i ==0)){
                greatesCommon= i;
            }
        }
        return greatesCommon;

    }
}
