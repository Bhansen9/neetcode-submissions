class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(char c : s.toCharArray()){
            if(count.containsKey(c)){
                count.put(c, count.get(c) + 1);
            } else{
                count.put(c, 1);
            }
        }
        for(char c : t.toCharArray()){
             if(!count.containsKey(c)){
                return false;
            }
            count.put(c, count.get(c) - 1);
            if((count.get(c) < 0)){
                return false;
            }
        }
        return true;
        }
    }
