public class UnsetBitAtPostion {
    public static void main(String[] args) {
        unsetIthBit(32,5);
    }
    public static void unsetIthBit(int n , int i){
        printBits(n);
        System.out.println("");
        n = (n&(~(1<<i)));
        System.out.println("After : ");
        printBits(n);
    }
        public static void printBits(int n){
        for (int i =7;i>=0;i--){
            System.out.print((n>>i)&1);
        }
    }
}