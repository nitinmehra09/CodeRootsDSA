import java.util.Scanner;

public class FindAllOccurence {
    public static void main(String[] args) {
        int a[] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 elements : ");
            for (int i =0 ; i<5;i++){
                a[i] = sc.nextInt();
            }
        }
        findAlloccurence(a,2);
        
    }
    public static void findAlloccurence(int a[], int x) {
        int arr[] = new int[10];
        int j = 0;
        for(int i = 0 ; i<a.length ; i++){
            if(a[i]==x){
                arr[j]=i;
                j++;
            }
        }
        System.out.println("Element are at : ");
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}