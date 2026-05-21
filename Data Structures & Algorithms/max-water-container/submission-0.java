class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int out = 0;
        int maxOut = 0;

        for(int i = 0; i < n; i++){
            for(int j = n - 1; j > i ; j--){
                out = Math.min(heights[i], heights[j]) * (j - i);
                maxOut = Math.max(maxOut, out);
            }
        }

        return maxOut;
    }
}
