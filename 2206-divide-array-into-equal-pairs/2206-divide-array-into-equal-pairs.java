class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }
         for(int freq : map.values()) {
            if(freq%2!=0) {
                return false;
            }
        }

        return true;
    }
}