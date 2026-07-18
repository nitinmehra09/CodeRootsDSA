public class LastOccurrence {
    private static  int func(int i, int t,int[]arr){
        if(i>=arr.length) return -1;
        int ans  = func(i+1,t,arr);
        if(arr[i]==t){
            if(ans==-1){
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,34,4,52,2,1,2};
        System.out.println(func(0, 4, arr));
    }
}
