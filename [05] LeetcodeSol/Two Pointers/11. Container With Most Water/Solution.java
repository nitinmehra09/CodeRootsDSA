class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int hLeft = height[left];
            int hRight = height[right];
            
            int min = hLeft < hRight ? hLeft : hRight;
            int area = min * (right - left);
            
            if(area > maxArea){
                maxArea = area;
            }
            
            if(hLeft < hRight){
                left++;
            } else {
                right--;
            }
        }
        return maxArea; 
    }
}