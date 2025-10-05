public class Implimentation {
    public static void main(String[] args) {
        int a[] = {1,4,2,5,22,9,3,11,7};
        printArray(a,"Before Sorting :");
        bubbleSortAlgo(a);
        printArray(a,"After Sorting : ");

    }
    public static void bubbleSortAlgo(int a[]) {
        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }
    public static void swap(int a[],int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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
