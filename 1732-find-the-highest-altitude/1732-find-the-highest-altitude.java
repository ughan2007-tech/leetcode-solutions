class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int ind=0;
        int[] result=new int[n];
        int max=0;

        for(int i=0;i<n;i++){
            if(i==0){
                 result[ind] = gain[i];
            }
            else{
                result[ind]=result[ind-1]+gain[i];
            }

            if(result[ind]>max){
                max=result[ind];
            }
            ind++;
        }
        return max;
    }
}