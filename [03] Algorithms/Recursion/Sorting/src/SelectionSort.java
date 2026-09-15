import java.util.Arrays;

public class SelectionSort {

    public static void SelectionSorting(int []a, int row , int col, int max) {
        if(row == 0){
            return;
        }
        if(row > col){
            if(a[col] > a[max]){
                SelectionSorting(a, row, col+1, col);
            }else {
                SelectionSorting(a, row, col+1, max);
            }
        }
        else{
            int temp = a[row-1];
            a[row-1] = a[max];
            a[max] = temp; 
            SelectionSorting(a, row-1, 0, 0);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,3};
        SelectionSorting(arr, arr.length,0 , 0);
        System.out.println(Arrays.toString(arr));
    }
}
