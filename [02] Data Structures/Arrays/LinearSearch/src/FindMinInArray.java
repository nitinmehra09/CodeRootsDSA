
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 elements : ");
            for (int i =0 ; i<5;i++){
                a[i] = sc.nextInt();
            }
        }
        int min = findMaxInAraay(a);
        System.out.println("min in array is : "+min);
    }
    public static int findMaxInAraay(int a[]){
        int min = a[0];
        for (int i = 0; i<a.length ; i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }
}