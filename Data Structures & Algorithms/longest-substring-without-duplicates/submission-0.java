class Solution {
    public int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> seen = new HashMap<>();
        int max = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            while(seen.containsKey(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            if(!seen.containsKey(s.charAt(right))){
                seen.put(s.charAt(right), +1);
            }
            if ((right - left + 1) > max){
                max = right - left+ 1;
            }
        }
        return max;
    }
}
