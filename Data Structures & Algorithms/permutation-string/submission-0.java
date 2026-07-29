class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int k= s1.length();
        int[] fqS1= new int[26], fqS2= new int[26];
        for(int i=0;i<s1.length();i++){
            fqS2[s2.charAt(i)-97]+= 1;
            fqS1[s1.charAt(i)-97]+= 1;
        }
        if(Arrays.equals(fqS1, fqS2))return true;
        
        for(int i=1;i<=s2.length()-s1.length();i++){
            fqS2[s2.charAt(i-1)-97]-=1;
            fqS2[s2.charAt(k)-97]+=1;
            if(Arrays.equals(fqS1, fqS2))return true;
            k+=1;
        }
        return false;
    }
}
