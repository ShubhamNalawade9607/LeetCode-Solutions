class Solution {
    public int findMin(int[] nums) {

        int si = 0;
        int ei = nums.length - 1;

        while (si < ei) {

            int mid = si + (ei - si) / 2;

            // Minimum is on the right
            if (nums[mid] > nums[ei]) {
                si = mid + 1;
            }

            // Minimum is at mid or on the left
            else {
                ei = mid;
            }
        }

        return nums[si];
    }
}