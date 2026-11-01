class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            group.putIfAbsent(sortedS, new ArrayList<>());
            group.get(sortedS).add(s);

        }
        return new ArrayList<>(group.values());
    }
}
