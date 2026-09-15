
public class InPlaceMergeSort {
    public static void mergeSort(int[] arr,int s, int e){
        if(e-s == 1){
            return;
        }
        int mid = s + (e-s)/2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);

        merge(arr,s,mid,e);
    }
    static void merge(int[] a, int s, int m, int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j<e){
            if(a[i]>a[j]){
                mix[k] = a[j];
                j++;
            }else{
                mix[k] = a[i];
                i++;
            }
            k++;
        }
        while (i < m) {
            mix[k++] = a[i++];
        }

        while (j < e) {
            mix[k++] = a[j++];
        }
        System.arraycopy(mix, 0, a, s, mix.length);
    }
    public static void main(String[] args) {
        int[] a = {1,6,2,8,3};
        mergeSort(a,0,a.length-1);
        for(int i: a){
            System.out.println(i);
        }
    }
}
