class Solution {

    public static void mergesort(int[] nums, int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Sort left half
        mergesort(nums, si, mid);

        // Sort right half
        mergesort(nums, mid + 1, ei);

        // Merge both sorted halves
        merge(nums, si, mid, ei);
    }

    public static void merge(int nums[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        // Compare both halves
        while (i <= mid && j <= ei) {

            if (nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Remaining left elements
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Remaining right elements
        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        // Copy temp back to nums
        for (k = 0, i = si; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public int[] sortArray(int[] nums) {

        mergesort(nums, 0, nums.length - 1);

        return nums;
    }
}