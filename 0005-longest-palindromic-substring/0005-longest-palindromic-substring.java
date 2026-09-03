class Solution {
    public String longestPalindrome(String s) {
        
        int n=s.length();
        int max=1;
        int start=0;
        int[][] dp=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==j){
                    dp[j][i]=1;
                    
                }
                else if(s.charAt(i)==s.charAt(j)){
                    if((i-j<2) || (dp[j+1][i-1]==1)){
                        dp[j][i]=1;
                        if(i-j+1>max){
                            max=i-j+1;
                            start=j;
                        }
                    }
                }
            

            }
        }
        
        return s.substring(start,start+max);
    }
}
    