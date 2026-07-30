class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        

        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxaverage=sum;

        while(r<n-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            maxaverage=Math.max(maxaverage,sum);
        }
        return (double)maxaverage/k;
    }
}