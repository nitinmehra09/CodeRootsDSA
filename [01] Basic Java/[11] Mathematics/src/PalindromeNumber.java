public class PalindromeNumber {
    public static void main(String[] args) {
        palindromeNumbers(125);
    }
    public static void palindromeNumbers(int n){
        int copy = n,res=0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            res = res*10+rem;
        }if(res == copy){
            System.out.println("Yes, it a palindrome no.");
            return;
        }
        System.out.println("No, it is not a palindrome no.");
    }
}