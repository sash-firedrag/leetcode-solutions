class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        int a=0,b=1;
        for(int i=1;i<nums.length;i+=2){
            arr[a]=nums[i];
            a=a+2;
        }
        for(int i=0;i<nums.length;i+=2){
            arr[b]=nums[i];
            b=b+2;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna