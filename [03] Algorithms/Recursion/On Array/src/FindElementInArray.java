public class FindElementInArray {
    public static boolean searchingInArray(int i, int[]arr, int t){
        if(i>=arr.length) return false;
        if(arr[i]==t){
            return true;
        }
        return searchingInArray(i+1, arr, t);
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,4,6,5,8,0,7,9};
        boolean ans = searchingInArray(0, arr, 11);
        System.out.println("target found : "+ans);
    }
}
