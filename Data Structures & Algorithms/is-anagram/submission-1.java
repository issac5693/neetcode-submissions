class Solution {
    public int sum(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            if(array[i]<0)return -1;
        }
        return sum;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] freq_array= new int[26];
        for(char chr: s.toCharArray()){
            freq_array[chr-'a']+=1;
        }
        for(char chr: t.toCharArray()){
            freq_array[chr-'a']-=1;
        }
        if(sum(freq_array)==0)return true;
        else return false;
    }
}
