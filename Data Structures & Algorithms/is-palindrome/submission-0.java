class Solution {
    public boolean isPalindrome(String s) {
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                charList.add(Character.toLowerCase(s.charAt(i)));
            } else {
                continue;
            }
        }

        List<Character> charListR = new ArrayList<>(charList);

        Collections.reverse(charListR);

        return charList.equals(charListR);
    }
}
