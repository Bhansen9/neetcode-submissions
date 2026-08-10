class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> seen = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);

            seen.put(current, seen.getOrDefault(current, 0) + 1);
            maxFreq = Math.max(maxFreq, seen.get(current));

            while((i - left + 1) - maxFreq > k){
                char leftChar = s.charAt(left);

                seen.put(leftChar, seen.get(leftChar) - 1);
                left++;
            }
            result = Math.max(result, i - left + 1);
        }
        return result;
    }
}
