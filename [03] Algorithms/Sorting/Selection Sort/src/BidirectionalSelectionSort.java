public class BidirectionalSelectionSort {
    public static void main(String[] args) {
        int a[] = {1,4,2,5,22,9,11,7,3};
        printArray(a,"Before Sorting :");
        BidirectionalSelectionSortAlgo(a);
        printArray(a,"After Sorting : ");
    }
    public static void swap(int a[],int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    public static void BidirectionalSelectionSortAlgo(int a[]) {
        int n = a.length;
        int k =n-1;
        for(int i =0;i<k;i++){
            int minIndex=i;
            int maxIndex=i;
            for(int j=i+1;j<=k;j++){
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(a,i,minIndex);

            if(maxIndex==i){
                swap(a,k,minIndex);
            }
            else{
                swap(a,k,maxIndex);
            }
            k--;
        }

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
}
