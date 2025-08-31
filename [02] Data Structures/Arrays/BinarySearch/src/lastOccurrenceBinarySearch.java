
import java.util.Scanner;

public class lastOccurrenceBinarySearch {
    public static void main(String[] args) {
        int a[] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 sorted element :");
            for(int i = 0; i<a.length; i++){
                a[i] = sc.nextInt();
            }
        }
        int index = binarySearch(a, 5);
        if (index == -1) {
            System.out.println("Element not found.");
        }
        else {
            while (index < a.length-1 && a[index + 1] == a[index]) {
                index++;
            }
            System.out.println("Element fount at index : "+index);
        }
    }
    public static int binarySearch(int a[], int x){
        int L = 0 , H = a.length-1;
        while(L<=H){
            int mid = L + (H - L) / 2;

            if(a[mid]==x)
                return mid;
            else if (a[mid]<x)
                L = mid +1;
            else if (a[mid]>x)
                H = mid -1;
        }
        return -1;
    }
}