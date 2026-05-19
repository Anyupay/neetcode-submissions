class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();

        for(Character sChar : s.toCharArray()){
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, 1);
            } else{
                sMap.put(sChar, sMap.get(sChar) + 1);
            }
        }

        for(Character tChar : t.toCharArray()){
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, 1);
            } else{
                tMap.put(tChar, tMap.get(tChar) + 1);
            }
        }

        if(sMap.equals(tMap)){
            return true;
        } else{
            return false;
        }
    }
}
