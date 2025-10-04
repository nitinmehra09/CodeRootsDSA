public class implimentation {
    public static void main(String[] args) {
        int a[] = {1,4,2,5,22,9,3,11,7};
        printArray(a,"Before Sorting :");
        insertionSort(a);
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
    public static void insertionSort(int a[]){
        int n = a.length;
        for(int i=1;i<n;i++){
            int j = i-1;
            int key = a[i];
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}