class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        List<Integer> num=new ArrayList<>();
        for(int i=min;i<=max;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                num.add(i);
            }
        }
        return num;
    }
}