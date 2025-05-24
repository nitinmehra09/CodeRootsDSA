public class AmstrongNumber {
    public static void main(String[] args) {
        isAmstrong(121);
    }    

    public static void isAmstrong(int n){
        int res = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            n = n/10;
            res = res+(int)Math.pow(rem,3);
        }
        if (res == temp){
            System.out.println("yes, it is Amstrong no.");
            return;
        }
        System.out.println("No, it is Not Amstrong no.");
    }
}