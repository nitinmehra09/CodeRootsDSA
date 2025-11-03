public class ReverseString02 {
    public static void main(String[] args){
        String str = "abcdef";
        char arr[] = str.toCharArray();
        int e = arr.length-1;
        for (int i=0;i<arr.length/2;i++){
            char temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
            e--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
