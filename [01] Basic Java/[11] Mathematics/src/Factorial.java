public class Factorial {
    public static void main(String[] args) {
        calculateFactorial(5);
    }
    
    public static void calculateFactorial(int n){
        if (n==0){
            System.out.println("Factorial of "+n+"is 1");
            return;
        }
        int res=1;
        while(n>0){
            res =res*n;
            n--;
        }
        System.out.println("Factorial of is "+res);
    }
}