class Solution {
    public int removeDuplicates(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
       }

       int l=0;
        int count = 0;

        for (int i=0;i<nums.length;i++) {

            if (i==0 || nums[i] != nums[i - 1]) {
                count = 1;
            } else {
                count++;
            }

            if (count <= 2) {
                nums[l] = nums[i];
                l++;
            }
        }

        return l;
    }
}