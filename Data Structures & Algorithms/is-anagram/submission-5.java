class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);
        if(Arrays.equals(firstString, secondString)){
            return true;
        }
        return false;
    }
}
