class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        double n1=(double)n;
        while(n1>4){
            n1=n1/4;
        }
        return n1==4;
    }
}