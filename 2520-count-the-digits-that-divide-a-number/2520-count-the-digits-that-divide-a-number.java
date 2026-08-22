class Solution {
    public int countDigits(int num) {
        int val=0;
        int c=0;
        int temp=num;
        while(temp>0){
            int n=temp%10;
            if(num%n==0){
                c++;
            }
            
            temp=temp/10;
        }
        return c;
    }
}