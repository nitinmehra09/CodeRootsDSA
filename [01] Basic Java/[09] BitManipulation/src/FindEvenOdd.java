public class FindEvenOdd {
    public static void main(String[] args) {
        isEvenOrOdd(15);
    }
    public static void isEvenOrOdd(int n){
        if ((1&n)==0) {
            System.out.println("It is Even ");
        }
        else{
            System.out.println("It is Odd ");
        }
    }
    
}