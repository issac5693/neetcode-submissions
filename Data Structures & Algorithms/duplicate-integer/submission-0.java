class Solution {
    public boolean findDuplicates(int[] arr){
        for(int i=0; i<((arr.length)-1); i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public boolean hasDuplicate(int[] nums) {
        return findDuplicates(nums);
    }
}
