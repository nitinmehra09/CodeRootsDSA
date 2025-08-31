import java.util.Scanner;

public class ceilingBinarySearch {
    public static void main(String[] args) {
        int []a = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0; i<a.length; i++){
                a[i] = sc.nextInt();
            }
        }
        int index = binarySearch(a,5);
        if (index != -1)
            System.out.println("Element's last Occurrence : " + index);
        else
            System.out.println("Element not found.");
    }
    public static int binarySearch(int a[], int x){
            int L = 0 , H = a.length-1;
            int result = -1;
            while(L<=H){
                int mid = L + (H - L) / 2;
                if(a[mid]==x){
                    result=mid;
                    L = mid +1;
                }
                else if (a[mid]<x)
                    L = mid +1;
                else if (a[mid]>x)
                    H = mid -1;
            }
            return result;
        }
}