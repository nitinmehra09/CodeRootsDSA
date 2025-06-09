public class TrailingZeroesInFactor {
    public static void main(String[] args) {
        double x = howManyZeroes(200);
        System.out.println(x);
    }
    public static double howManyZeroes(int num){
        double res = 0;
        for(int i = 5;i<=num;i=i*5){
            res = res + (int)(num/i);
        }
        return res;
    }
}