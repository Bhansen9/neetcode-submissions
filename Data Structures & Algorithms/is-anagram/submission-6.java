class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> seen = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; s.length() > i; i++){
            char current = s.charAt(i);
            seen.put(current, seen.getOrDefault(current, 0) + 1);
        }
        for(int i = 0;t.length() > i; i++){
            char current = t.charAt(i);
            if(!seen.containsKey(current)){
                return false;
            }
            seen.put(current, seen.get(current) - 1);
            if(seen.get(current) < 0){
                return false;
            }
        }
        return true;
    }
}
