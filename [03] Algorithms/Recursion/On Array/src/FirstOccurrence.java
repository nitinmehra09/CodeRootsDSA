public class FirstOccurrence {
    public static int func(int i, int[] arr,int t){
        if(i==arr.length) return -1;  
        if(arr[i]==t){
            return i;
        }
        return func(i+1,arr,t); 
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,4,5,6,8,97,5,7,9};
        System.out.println("First Occurrence of 5 in arr is : "+func(0, arr, 5));
    }
}
