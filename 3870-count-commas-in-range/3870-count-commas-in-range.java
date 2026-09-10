class Solution {
    public int countCommas(int n) {
      int a=0;
      long c=1000;
      if(c<=n){
        a+=n-c+1;
        c*=100;
      }
      return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna