class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String firstElement = strs[0];
        boolean result = false;
        for (int i = 0; i <= firstElement.length(); i++) {
            String prefix = firstElement.substring(0, i);
            result = Arrays.stream(strs).allMatch(s -> s.startsWith(prefix));

            if (!result & i == 0) {
                return "";
                
            }
            else if (!result)
            {
                return firstElement.substring(0, i - 1);
            }
        }

        if (result) {
            return firstElement;
        } else {
            return "";
        }
    }
}