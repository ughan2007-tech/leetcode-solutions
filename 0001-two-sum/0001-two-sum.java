import java.util.Hashtable;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
       Hashtable<Integer,Integer> table = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(table.containsKey(rem)){
                arr[0]=table.get(rem);
                arr[1]=i;
                break;
            }
             table.put(nums[i], i);
        }
        return arr;
    }
}