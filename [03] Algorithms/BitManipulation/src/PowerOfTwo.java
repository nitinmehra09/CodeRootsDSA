public class PowerOfTwo {
    public static void main(String[] args) {
        boolean f = isPowerOfTwo(18);
        System.out.println(f);
    }
    public static boolean isPowerOfTwo(int n) {
        if(n== -2147483648){
            return false;
        }
        if(n == 0){
            return false;
        }
        int x = n & (n-1);
        return x == 0;
    }
}