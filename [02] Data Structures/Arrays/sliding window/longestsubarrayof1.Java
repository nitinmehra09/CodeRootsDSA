class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeros = 0, res = 0;

        // Sliding window: expand with 'right' and shrink with 'left' when more than one zero
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++; // count zeros in the window

            // If more than one zero, move left pointer to make the window valid
            while (zeros > 1) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            // right - left gives window size minus one deleted element
            res = Math.max(res, right - left);
        }

        return res;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        int[] nums = {1, 1, 0, 1};
        int result = ob.longestSubarray(nums);
        System.out.println(result); // Expected output: 3
    }
}
