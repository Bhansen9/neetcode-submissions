class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for(String word : strs){
            char[] characters = word.toCharArray();
            Arrays.sort(characters);

            String key = new String(characters);

            if(!group.containsKey(key)){
                group.put(key, new ArrayList<>());
            }

            group.get(key).add(word);
        }
        return new ArrayList<>(group.values());


    }
}
