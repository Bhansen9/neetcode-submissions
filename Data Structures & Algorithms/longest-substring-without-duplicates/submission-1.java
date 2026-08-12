class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();

        int left = 0;
        int right = 0;
        int result = 0;

        while(right < s.length()){
                char current = s.charAt(right);
                while(seen.contains(current)){
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.add(current);

                result = Math.max(result, right - left + 1);

                right++;
        }
        return result;
    }
}
