class Solution {
    public boolean rotateString(String s, String goal) {
        s+=s;
        if(s.contains(goal) && s.length()
        !=goal.length()){
            System.out.println(s.indexOf(goal));
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna