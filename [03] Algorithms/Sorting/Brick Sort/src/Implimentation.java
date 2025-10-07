public class Implimentation {
    public static void main(String[] args) {
        int a[] = {1,4,2,5,22,9,3,11,7};
        printArray(a,"Before Sorting :");
        brickSortAlgo(a);
        printArray(a,"After Sorting : ");

    }
    public static void brickSortAlgo(int a[]) {
        int n = a.length;
        boolean isSwap=false;
        while (!isSwap) { 
            isSwap=true;
            for(int i=0;i<n-1;i+=2){
                if(a[i]>a[i+1]){
                    swap(a,i,i+1);
                    isSwap=false;
                }
            }
            for(int i=1;i<n-1;i+=2){
                if(a[i]>a[i+1]){
                    swap(a,i,i+1);
                    isSwap=false;
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
