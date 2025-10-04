import java.util.Scanner;

public class FindMinimumAbsoluteDifference {
    static int floor ;
    static int ceil ;
    public static void main(String[] args) {
        int []a = new int[5];
        int x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 sorted integers:");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Enter the element to search for:");
            x = sc.nextInt();
        }
        int index = binarySearch(a, x);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else{
            System.out.println("Element not found.");
            System.out.print("minimum absolute difference : ");
            System.out.println(Math.min(Math.abs(x-floor),Math.abs(x-ceil))); 
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
        if (H < 0) {
            floor = a[0];   
            ceil = a[0];
        } else if (L >= a.length) {
            floor = a[a.length - 1];  
            ceil = a[a.length - 1];
        } else {
            floor = a[H];
            ceil = a[L];
        }
        return -1;
    }
}