class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null | nums.length == 0){return 0;}
        // Array sort
        Arrays.sort(nums);

        int hiCount = 1;
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]) continue;
            if(nums[i] - nums[i - 1] == 1){
                count++;
                if(count > hiCount) {hiCount = count;}
            } else {
                count = 1;
            }
        }

        return hiCount;
    }
}
