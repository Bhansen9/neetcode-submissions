class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int pointer_1 = 0;
        int pointer_2 = s.length() - 1;
        if (s.isEmpty()) return true;
        while (pointer_2 > pointer_1){
            if(s.charAt(pointer_1) == s.charAt(pointer_2)){
                pointer_1++;
                pointer_2--;
            } else{
                return false;
            }
        if(pointer_2 == pointer_1){
            if(s.charAt(pointer_1) == s.charAt(pointer_2)){
                return true;
            }else{
                return false;
            }
        }
        }
        return true;
    }
}
