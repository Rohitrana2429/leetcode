class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // this line reperesnets the last index of nums1
        int j = n - 1; // Last index of nums2
        int k = m + n -1; // last index of merged array

        //Iterate throuh a while loop that will perform the merging of this 2 arrays nums1 and nums2
        while (i >= 0 && j>=0){
            if (nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--; 
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        //Copy the remaining elements from nums2, if any
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Solution solution = new Solution(); //Create an instance of the Solution class
        solution.merge(nums1, m, nums2, n); // Call the merge method on the instance

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
