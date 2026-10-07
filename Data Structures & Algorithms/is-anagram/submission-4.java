class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> res = new HashMap<>();

        if(s.length() != t.length())
            return false;

        for(int i =0; i < s.length(); i++){
            if(res.get(s.charAt(i)) == null)
                res.put(s.charAt(i),0);
            res.put(s.charAt(i),res.get(s.charAt(i)) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            int value = res.get(t.charAt(i)) != null ? res.get(t.charAt(i)) : 0;

            if(value == 0)
                return false;

            res.put(t.charAt(i),value - 1);
        }
        return true;
    }
}
