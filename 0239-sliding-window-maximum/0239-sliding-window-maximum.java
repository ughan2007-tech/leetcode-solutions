class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr=new int[nums.length-k+1];
        int ind=0;
        int r=0;
        int l=0;
         Deque<Integer> dq = new ArrayDeque<>();
        while(r<nums.length){
            
             while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[r]) {
                dq.pollLast();
            }

            dq.addLast(r);
             if (dq.peekFirst() < l) {
                dq.pollFirst();
            }
            if(r-l+1==k){
               
                arr[ind]=nums[dq.peekFirst()];
                ind++;
                
                l=l+1;
            }
            r++;
        }
        return arr;
    }
}