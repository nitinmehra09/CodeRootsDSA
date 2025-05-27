
public class PrintBits {
    public static void main(String[] args) {
        printBits(32);
    }
    public static void printBits(int n){
        for (int i =7;i>=0;i--){
            System.out.print((n>>i)&1);
        }
    }
}