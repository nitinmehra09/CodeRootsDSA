public class PrintElementsOfArray{
    public static void printing(int i,int[]arr){
        if(i>=arr.length) return;
        System.out.print(arr[i] + "\t");
        printing(i+1, arr);
    }
    public static void reversePrinting(int i,int[]arr){
        if(i==arr.length) return;
        reversePrinting(i+1, arr);
        System.out.print(arr[i] + "\t");
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,1,3,5};
        printing(0, arr);
        System.out.println("\nReverse Printing : ");
        reversePrinting(0,arr);
    }
}