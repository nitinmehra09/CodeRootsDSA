public class CountDigitsUsingLog {
    public static void main(String[] args) {
        CountDigitUsingLog(912399);
        CountDigitUsingLog(0);
    }
    public static void CountDigitUsingLog(int n){
        if (n==0){
            System.out.println("no. of digits is 1");
            return;
        }
        int res =((int)Math.log(n)/(int)Math.log(10));
        System.out.println("no. of digits is "+ res);
    }
}