
import java.util.Scanner;

public class JaggedArray {
        public static void main(String[] args) {
            int arr[][] = new int[3][];
            Scanner sc = new Scanner(System.in);
            int n = 4;
            for (int i = 0; i<n ;i++){
                for (int j = 0; j<n;j++){
                    System.err.println("Enter value at "+i+","+j);
                    arr[i][j] = sc.nextInt();
                }
            }
            sc.close();
        }    
}