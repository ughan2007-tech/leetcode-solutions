class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }}
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            if(map.containsKey(sum)){
                maxLen=Math.max(maxLen,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;
        }
    }
