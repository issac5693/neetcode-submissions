class Solution {
    public static boolean usingHashSet(int[] arr){
        HashSet<Integer> Set= new HashSet<Integer>();
        for (int i=0; i<arr.length;i++){
            Set.add(arr[i]);
        }
        if (arr.length==Set.size()){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean hasDuplicate(int[] nums) {
        return usingHashSet(nums);
    }
}
