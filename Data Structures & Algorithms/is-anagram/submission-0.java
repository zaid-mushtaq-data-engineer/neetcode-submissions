class Solution {
    // Remember: Use toCharArray() → Arrays.sort() → new String() whenever you need to sort the characters of a string.
    public boolean isAnagram(String s, String t) {
        
        if(sortedString(s).equals(sortedString(t))){
            return true;
        }
        return false;

    }

    private String sortedString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        return sortedString;

    }

}
