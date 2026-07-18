public class BasicOfRecursion{
    // public static void print1toN(int n, int i){
    //     if(i==n) return;
    //     System.out.print(i + "\t");
    //     print1toN(n, i+1);
    // }
    public static void print1toN(int n){
        if(n==0) return;
        print1toN(n-1);
        System.out.print(n+"\t");
    }
    public static void printNto1(int n){
        if(n==0) return;
        System.out.print(n+"\t");
        print1toN(n-1);
    }
    public static void main(String[] args) {
        print1toN(5);
        System.out.println("\nReverse Order : ");
        printNto1(5);
    }
}