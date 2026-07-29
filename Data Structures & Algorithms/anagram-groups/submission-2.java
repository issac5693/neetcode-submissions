class Solution {
    public ArrayList<Integer> getFreqArrayList(String str){
        ArrayList<Integer> freqArr= new ArrayList<>();
        for(int i=0;i<26;i++){
            freqArr.add(0);
        }
        for(char chr: str.toCharArray()){
            freqArr.set(chr-'a', 1);
        }
        return freqArr;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        Map<ArrayList<Integer>, ArrayList<String>> map= new HashMap<>();
        for(String str:strs){
            
            map.computeIfAbsent(getFreqArrayList(str), k-> new ArrayList<String>()).add(str);
        }
        for(ArrayList<String> value: map.values()){
            res.add(value);
        }
        return res;
    }
}
