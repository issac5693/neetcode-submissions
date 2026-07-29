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
            StringBuilder sb= new StringBuilder();
            while(i<len && (str.charAt(i)>='0' && str.charAt(i)<='9')){
                sb.append(str.charAt(i));
                i++;
            }
            int l= Integer.parseInt(sb.toString());
            res.add(str.substring(i, l+i));
            i=i+l;
        }
        return res;
    }
}
