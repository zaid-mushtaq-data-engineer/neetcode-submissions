class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String key = sortString(strs[i]);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
       

        return new ArrayList<>(map.values());
    }

    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        return sortedString;
    }
}
