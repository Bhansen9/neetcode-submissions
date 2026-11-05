class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();

        for(int i = 0; s.length() > i; i++){
            char c = s.charAt(i);
            maps.put(c, maps.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; t.length() > i; i++){
            char c = t.charAt(i);
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }
        return maps.equals(mapt);
    }
}
