class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> seen_s1 = new HashMap<>();
        HashMap<Character, Integer> seen_s2 = new HashMap<>();
        boolean result = false;
        int left = 0;

        for(char c : s1.toCharArray()){
            seen_s1.put(c, seen_s1.getOrDefault(c, 0) + 1);
        }
        for (int right = 0; right < s2.length(); right++) {
            char rightChar = s2.charAt(right);
            seen_s2.put(rightChar, seen_s2.getOrDefault(rightChar, 0) + 1);

            if (right - left + 1 > s1.length()) {
                char leftChar = s2.charAt(left);
                seen_s2.put(leftChar, seen_s2.get(leftChar) - 1);

                if (seen_s2.get(leftChar) == 0) {
                    seen_s2.remove(leftChar);
                }

                left++;
            }

            if (seen_s1.equals(seen_s2)) {
                result = true;
            }
        }

        return result;
    }
}