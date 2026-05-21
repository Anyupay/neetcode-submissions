class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            int product = 1;

            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }

                product *= nums[j];
            }

            // insert the target product to that nums[i]
            result[i] = product;
        }

        return result;
    }
}  
