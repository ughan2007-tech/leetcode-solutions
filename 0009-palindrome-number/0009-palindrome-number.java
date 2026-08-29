class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int ans=0;
        while(n>0){
            ans+=n%10;
            ans*=10;
            n=n/10;
        }
        ans/=10;
        return x==ans;
    }
}