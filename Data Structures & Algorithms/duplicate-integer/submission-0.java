class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean isRepeat = false;

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            } else{
                isRepeat = true;
                break;
            }
        }

        if(isRepeat){
            return true;
        } else{
            return false;
        }
    }
}