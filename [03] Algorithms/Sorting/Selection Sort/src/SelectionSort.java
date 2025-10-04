public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {1,4,2,5,22,9,3,11,7};
        printArray(a,"Before Sorting :");
        selectionSortAlgo(a);
        printArray(a,"After Sorting : ");

    }
    public static void printArray(int a[],String ch) {
        int n = a.length;
        System.out.println("\n"+ch);
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            if(i!=n-1){
                System.out.print(",");
            }
        }
    }
    public static void swap(int a[],int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    public static void selectionSortAlgo(int a[]){
        int n = a.length;
        for(int i =0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            swap(a,i,minIndex);
        }

    }
}
