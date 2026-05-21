class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            numSet.add(num);
        }

        int longest = 0;

        for(int num : nums){
            if(!numSet.contains(num - 1)){
                int count = 1;
                while(numSet.contains(num + count)){
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
