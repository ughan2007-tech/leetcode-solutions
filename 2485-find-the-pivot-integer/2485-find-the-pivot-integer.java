class Solution {
    public int pivotInteger(int n) {
        int totalsum=n*(n+1)/2;
        int x=(int)Math.sqrt(totalsum);
        if(totalsum==x*x){
            return x;
        }
        return -1;
    }
}