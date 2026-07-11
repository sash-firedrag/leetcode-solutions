class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix[0].length;
        int c=matrix.length;
        int trans[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                trans[i][j]=matrix[j][i];
            }
        }
        return trans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna