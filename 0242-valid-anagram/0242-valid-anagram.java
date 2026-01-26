class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            char[] schar = s.toCharArray();
            char[] tchar = t.toCharArray();

            Arrays.sort(schar);
            Arrays.sort(tchar);

            for(int i=0;i<s.length();i++){
                if(schar[i] != tchar[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}