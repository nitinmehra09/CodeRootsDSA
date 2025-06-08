public class GCD {
    public static void main(String[] args) {
        int x = gcdBetweenTwoNumber(36,24);
        System.out.println((x));
    }
    public static int gcdBetweenTwoNumber(int n , int m){
        int min = Math.min(n, m);
        for (int i = 0; i < min; min--) {
            if(n%min == 0 && m%min == 0){
                return min;
            }
        }
        return min;
    }
}