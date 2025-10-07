public class Implimentation {
    public static void main(String[] args) {
        int a[] = {24,22,25,22,21,27};
        printArray(a,"Before Sorting :");
        pigeonholeAlgo(a);
        printArray(a,"After Sorting : ");

    }
    public static void pigeonholeAlgo(int a[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        int h = max-min+1;
        int arr[] = new int[h];
        for(int i=0;i<a.length;i++){
            int index = a[i]-min;
            arr[index]++;
        }
        int index=0;
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[i]; j++) {
                a[index]=i+min;
                index++;   
                if(index>a.length){
                    break;
                }             
            }
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
