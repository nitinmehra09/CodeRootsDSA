public class ToggleIthBit {
    public static void main(String[] args) {
        toggleBitAtIthPosition(32,0);
    }
    public static void toggleBitAtIthPosition(int n , int i){
        printBits(n);
        System.out.println("");
        n = ((1<<i)^n);
        System.out.println("After : ");
        printBits(n);
    }
    public static void printBits(int n){
        for (int i =7;i>=0;i--){
            System.out.print((n>>i)&1);
        }
    }
}