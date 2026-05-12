class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> groups = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String str : strs){
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int num : count){
                sb.append(num);
                sb.append('#');  
                }
            String key = sb.toString();
            if(groups.containsKey(key)){
                groups.get(key).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                groups.put(key, list);
            }        
            }
        result.addAll(groups.values());
        return result;
        }
        }
