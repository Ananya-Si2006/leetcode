class Solution {
    public int search(int[] nums, int target) {
         int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Found target
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;  // target lies in left half
                } else {
                    left = mid + 1;   // target lies in right half
                }
            } 
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;   // target lies in right half
                } else {
                    right = mid - 1;  // target lies in left half
                }
            }
        }
        return -1; // target not found
    }
        
        

    
}