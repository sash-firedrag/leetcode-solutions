class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                a.add("FizzBuzz");
            }
            else if(i%5==0){
                a.add("Buzz");
            }
            else if(i%3==0){
                a.add("Fizz");
            }
            else{
                a.add(String.valueOf(i));
            }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna