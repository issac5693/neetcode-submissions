class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(String str: strs){
            sb.append(str.length()+str);
        }
        return new String(sb);
    }

    public List<String> decode(String str) {
        List<String> res= new ArrayList<>();
        int len= str.length(),i=0;
        while(i<len){
            int l= str.charAt(i)-'0';
            res.add(str.substring(i+1, l+i+1));
            i=i+l+1;
        }
        return res;
    }
}
