class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int ans=0;
        for(int val:map.keySet()){
            if(map.get(val)==2){
                ans^=val;
            }
        }
        return ans;
    }
}
