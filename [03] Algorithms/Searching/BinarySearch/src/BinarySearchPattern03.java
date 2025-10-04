
import java.util.Scanner;

public class BinarySearchPattern03 {
    public static void main(String[] args) {
        int []a = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0; i<a.length; i++){
                a[i] = sc.nextInt();
            }
        }
        int index = generalBinarySearch(a,5);
        if(index !=-1){
            System.out.println("Element found at index : "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int generalBinarySearch(int a[], int x){
        int L =0, H =a.length-1;
        if(a[L] > a[H]){
            return binarySearchDecreasing(a, x);
        }
        else if(a[L] < a[H]){
            return binarySearchIncresing(a, x);
        }else{
            return 0;
        }
    }
    public static int binarySearchDecreasing(int a[], int x){
        int L =0, H =a.length-1;
        while(L<=H){
            int mid = L + (H-L)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]<x){
                H = mid-1;
            }
            else if(a[mid]>x){
                L = mid +1;
            }
        }
        return -1;
    }
    public static int binarySearchIncresing(int a[], int x){
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