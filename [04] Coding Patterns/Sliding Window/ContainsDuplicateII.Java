import java.util.*;

/**
 * ✅ Problem Description:
 * Given an integer array `nums` and an integer `k`,
 * return true if there are two distinct indices i and j in the array
 * such that:
 * 
 *   nums[i] == nums[j]
 * and
 *   |i - j| <= k
 * 
 * Otherwise, return false.
 * 
 * Example:
 * Input: nums = [1, 2, 3, 1], k = 3
 * Output: true
 * 
 * Explanation:
 * The duplicate number 1 appears at indices 0 and 3.
 * The distance between them is |3 - 0| = 3, which is ≤ k.
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map to store the last index of each number
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the number has been seen before
            if (map.containsKey(nums[i])) {
                // Check if the difference between indices is ≤ k
                if (i - map.get(nums[i]) <= k) {
                    return true; // Found a valid pair
                }
            }
            // Update or add the current number with its latest index
            map.put(nums[i], i);
        }
        
        // If no such pair is found
        return false;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        
        boolean result = ob.containsNearbyDuplicate(nums, k);
        
        // Output: true
        System.out.println(result);
    }
}import java.util.*;

/**
 * ✅ Problem Description:
 * Given an integer array `nums` and an integer `k`,
 * return true if there are two distinct indices i and j in the array
 * such that:
 * 
 *   nums[i] == nums[j]
 * and
 *   |i - j| <= k
 * 
 * Otherwise, return false.
 * 
 * Example:
 * Input: nums = [1, 2, 3, 1], k = 3
 * Output: true
 * 
 * Explanation:
 * The duplicate number 1 appears at indices 0 and 3.
 * The distance between them is |3 - 0| = 3, which is ≤ k.
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map to store the last index of each number
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the number has been seen before
            if (map.containsKey(nums[i])) {
                // Check if the difference between indices is ≤ k
                if (i - map.get(nums[i]) <= k) {
                    return true; // Found a valid pair
                }
            }
            // Update or add the current number with its latest index
            map.put(nums[i], i);
        }
        
        // If no such pair is found
        return false;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        
        boolean result = ob.containsNearbyDuplicate(nums, k);
        
        // Output: true
        System.out.println(result);
    }
}