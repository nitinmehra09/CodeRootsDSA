

public class CountDigit {
    public static void main(String[] args) {
        Count(0);
    }
    public static void Count(int n) {
        int count= 0;
        if (n == 0){
            System.out.println("no. of digits is 1");
            return;
        }
        while(n>0){
            n = n/10;
            count++;
        }       
        System.out.println("no. of digits is "+count); 
    }
}
