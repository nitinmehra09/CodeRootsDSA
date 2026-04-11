import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int f=0;f<nums.length-2;f++){
            if(nums[f]>0){
                break;
            }
            if(f==0 || nums[f]!=nums[f-1]){
                twoSum(nums,f,ans);
            }
        }
        return ans;
    }
    
    public void twoSum(int[] arr, int f, List<List<Integer>> ans){
        int i = f+1,
            j = arr.length-1;
        while(i<j){
            int val = arr[f];
            int sum = val + arr[i] + arr[j];
            // int sum = arr[f] + arr[i] + arr[j];
            if(sum>0){
                j--;
            }else if(sum<0){
                i++;
            }else{
                //found
                ans.add(Arrays.asList(arr[f],arr[i],arr[j]));
                i++;
                j--;
                while(i<j && arr[i]==arr[i-1]){
                    i++;
                }
                while(i<j && arr[j]==arr[j+1]){
                    j--;
                }
            }
        }
    }
}