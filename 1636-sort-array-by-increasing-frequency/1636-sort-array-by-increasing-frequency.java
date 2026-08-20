class Solution {
    public int[] frequencySort(int[] nums) {
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
         Integer[] arr = new Integer[nums.length];
         for(int i=0;i<nums.length;i++) {
            arr[i]=nums[i];
        }
         Arrays.sort(arr, (a, b) -> {

            if(map.get(a) != map.get(b)) {
                return map.get(a) - map.get(b);
            }

            return b - a;
        });
         for(int i=0;i<nums.length;i++) {
            nums[i]=arr[i];
        }
        return nums;
    }
}