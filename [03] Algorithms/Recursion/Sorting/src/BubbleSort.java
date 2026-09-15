
import java.util.Arrays;

public class BubbleSort{
    public static void bubbleSorting(int[] arr,int row, int col){
        if(row == arr.length){
            return;
        }
        if(row > col){
             if(arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
             }
        bubbleSorting(arr, row, col+1);
        }else{
            bubbleSorting(arr,row+1,0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,8,4};
        bubbleSorting(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}