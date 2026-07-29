class Solution {
    public boolean checkAnagram(String s, String t){
        int sLength= s.length();
        if(sLength != t.length()){
            return false;
        }
        int sSum= 0;
        int tSum=0;
        for (int i=0; i<sLength; i++){
            sSum += s.charAt(i);
            tSum += t.charAt(i);
        }
        if(sSum==tSum){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isAnagram(String s, String t) {
        return checkAnagram(s,t);
    }
}
