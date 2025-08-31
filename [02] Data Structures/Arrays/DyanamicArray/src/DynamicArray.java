

public class DynamicArray{
    public static void main(String[] args) {
        int ar[] = new int[10];
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        for (int i = 0; i < 10; i++) {
            ar[i] = 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
            System.out.println(ar[i]);
        }
    }
}