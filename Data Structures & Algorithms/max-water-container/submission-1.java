class Solution {
    public int maxArea(int[] heights) {
        // Two pointer
        int l = 0;
        int r = heights.length - 1;
        int res = 0;

        while(l < r){
            res = Math.max(res, Math.min(heights[l], heights[r]) * (r - l));
            if(heights[l] < heights[r]){
                l++;
            } else { 
                r--;
            }
        }
        return res;
    }
}
