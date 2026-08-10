class Solution {
    public int findKthPositive(int[] arr, int k) {
        int c=0;
        for(int i=1; ;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
            if(i==arr[j]){
                found=true;
                break;
            }
        }
        if (!found) {
                c++;

                if (c == k) {
                    return i;
                }
            }
        }
        
    }
}