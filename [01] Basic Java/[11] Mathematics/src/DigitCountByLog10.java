public class DigitCountByLog10 {
    public static void main(String[] args) {
        digitsCountByLog10(43578);
    }
    public static void digitsCountByLog10(int n){
        if (n==0){
            System.out.println("No. of digit is 1");
        }
        int res = (int)Math.log10(n)+1;
        System.out.println("No. of digit is "+res);
    }
    
}