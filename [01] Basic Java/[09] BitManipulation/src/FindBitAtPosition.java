public class FindBitAtPosition {

    public static void main(String[] args) {
        isBitSet(32,5);
        printBits(32);
    }
    public static void isBitSet(int n , int i){
            if ((n & (1 << i)) != 0){
                System.out.println("Bit is set");
            }
            else{
                System.out.println("Bit is Unset");
            }
    }
     public static void printBits(int n){
        for (int i =7;i>=0;i--){
            System.out.print((n>>i)&1);
        }
    }
}