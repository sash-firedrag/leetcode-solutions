class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0,total=0,pos=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                total+=sum;
                sum=0;
                pos=i+1;
            }
        }
        total+=sum;
        return total>=0?pos:-1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna