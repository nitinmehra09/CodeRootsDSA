public class PrimeNumber {
    public static void main(String[] args) {
        isPrimeNumber(15);
    }
    public static void isPrimeNumber(int n){
        int i=2;
        boolean f = false;
        while(i<n/2) {
            if(n%i==0){
                f = true;
            }
            i++;            
        }
        if(f){
            System.out.println("NO, it is not a prime no.");
        }else{
            System.out.println("Yes, it is a prime no.");
        }
    }
}