
import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 elements : ");
            for (int i =0 ; i<5;i++){
                a[i] = sc.nextInt();
            }
        }
        int max = findMaxInAraay(a);
        System.out.println("min in array is : "+max);
    }
    public static int findMaxInAraay(int a[]){
        int max = a[0];
        for (int i = 0; i<a.length ; i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
}