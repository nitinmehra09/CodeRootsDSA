
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[][] = new int[2][2];
            for(int i = 0; i<2; i++){
                for (int j = 0; j < 2; j++) {
                    System.out.print("Enter value at " + (i+1) + "," + (j+1)+": ");
                    arr[i][j] = sc.nextInt();                
                }
            }
            for(int i = 0; i<2; i++){
                for (int j = 0; j < 2; j++) {
                    System.out.print(arr[i][j]+"\t");
                }   
                System.out.println("\n");            
            }
            System.out.println("lenght of arr = "+arr.length);
            System.out.println("lenght of arr[0] = "+arr[0].length);
        }
    }
    
}