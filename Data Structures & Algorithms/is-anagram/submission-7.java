class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();
        for(int i = 0; s.length() > i; i++){
            char current = s.charAt(i);
            maps.put(current, maps.getOrDefault(current, 0) + 1);
        }
        for(int i = 0; t.length() > i; i++){
            char current = t.charAt(i);
            mapt.put(current, mapt.getOrDefault(current, 0) + 1);
        }
        return maps.equals(mapt);
    }
}
