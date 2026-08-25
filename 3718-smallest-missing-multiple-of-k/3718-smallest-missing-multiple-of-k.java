class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=1;i<=100+1;i++){
            int target = i * k;
            boolean found = false;
            for(int j=0;j<nums.length;j++){
                if(target==nums[j]){
                   found = true; 
                    break;
                    
                }
            }
             if (!found) {
                return target;
            }
            
        }
        return 0;
    }
}