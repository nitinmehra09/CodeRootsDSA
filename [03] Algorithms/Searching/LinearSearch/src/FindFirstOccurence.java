import java.util.Scanner;

public class FindFirstOccurence {
    public static void main(String[] args) {
        int a[] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 elements : ");
            for (int i =0 ; i<5;i++){
                a[i] = sc.nextInt();
            }
        }
        int index = findFirstOccurence(a, 5);
        System.out.println(index);
    }
    public static int findFirstOccurence(int a[],int x) {
        for (int i=0;i<a.length;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
        
    }
}