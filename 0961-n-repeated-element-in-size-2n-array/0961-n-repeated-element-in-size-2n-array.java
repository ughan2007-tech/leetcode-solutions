class Solution {
    public int repeatedNTimes(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1){
                n=nums[i];
                map.put(nums[i], 0);
            }
        }
        return n;
    }
}