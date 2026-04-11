class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int right = 0;
        while(right<nums1.length){
            for(int j =0 ;j<nums2.length;j++){
                if(nums1[right]==nums2[j]){
                    set.add(nums2[j]);
                }
            }
            right++;
        }
        int[] arr = new int[set.size()];
        int i = 0;

        for(int num : set){
            arr[i++] = num;
        }
        return arr;
    }
}