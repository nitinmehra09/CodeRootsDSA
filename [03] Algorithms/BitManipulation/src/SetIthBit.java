public class SetIthBit {

    public static void main(String[] args) {
        setIthBit(32,0);
    }
    public static void setIthBit(int n , int i){
        printBits(n);

        n = (n | (1<<i));
        System.out.println("");
        printBits(n);

    }

    public static void printBits(int n){
        for (int i =7;i>=0;i--){
            System.out.print((n>>i)&1);
        }
    }
}