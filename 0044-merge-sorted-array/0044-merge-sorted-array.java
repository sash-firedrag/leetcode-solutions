class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Your current implementation is CORRECT and optimal!
        // Time Complexity: O(m + n) - You traverse each element in both arrays at most once.
        // Space Complexity: O(1) - You are merging in-place without extra storage.
        // This is the most efficient approach for this problem.
        int p1=m-1,p2=n-1,i=n+m-1;
        while(p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i--]=nums1[p1--];
            }
            else{
                nums1[i--]=nums2[p2--];
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna