import java.util.Arrays;

public class MergeSort {
    static int[] mergeSorting(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergeSorting(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSorting(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] a, int[] b){
        int[] mix = new int[a.length+b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i!=a.length && j!=b.length){
            if(a[i]>b[j]){
                mix[k] = b[j];
                j++;
            }else{
                mix[k] = a[i];
                i++;
            }
            k++;
        }
        while (i < a.length) {
            mix[k++] = a[i++];
        }

        while (j < b.length) {
            mix[k++] = b[j++];
        }
        return mix;
    }
    public static void main(String[] args) {
        int[] a = {1,6,2,8,3};
        int[] sorted = mergeSorting(a);
        for(int i: sorted){
            System.out.println(i);
        }
    }
}
