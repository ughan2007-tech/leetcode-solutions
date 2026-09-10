class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> subNum = new HashMap<>();
        subNum.put(0, 1);
        int total=0;
        int c=0;

        for(int n:nums){
            total+=n;
            if(subNum.containsKey(total-k)){
                c+=subNum.get(total-k);
            }
            subNum.put(total,subNum.getOrDefault(total,0)+1);
        }
        return c;
    }
}