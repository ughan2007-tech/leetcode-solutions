class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        Arrays.fill(hash,-1);

        int maxlen=0;
        int r=0;
        int l=0;
        int n=s.length();

        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                l=Math.max(hash[s.charAt(r)]+1,l);
            }
            hash[s.charAt(r)] = r;
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}