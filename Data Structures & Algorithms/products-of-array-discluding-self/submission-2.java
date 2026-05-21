class Solution {
    public int[] productExceptSelf(int[] nums) {
        // if n of zero >= 2, all are 0 in array
        // if n = 1, the pos with value of 0 is product and others are 0
        // if n = 0, normal output
        int n = nums.length;
        int prod = 1;
        int zero = 0;

        for(int num : nums){
            if(num == 0){
                zero++;
            } else {
                prod *= num;
            }
        }

        if(zero > 1){
            return new int[n];
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            if(zero > 0){
                res[i] = nums[i] == 0 ? prod : 0;
            } else {
                res[i] = prod / nums[i];
            }
        }

        return res;
    }
}  
