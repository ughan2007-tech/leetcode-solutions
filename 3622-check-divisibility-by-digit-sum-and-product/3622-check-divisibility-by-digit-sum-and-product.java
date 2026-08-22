class Solution {
    public boolean checkDivisibility(int n) {
        int temp1=n;
        int sum=0;
        while(temp1>0){
            sum+=temp1%10;
            temp1=temp1/10;
        }

        int temp2=n;
        int mul=1;
        while(temp2>0){
            mul*=temp2%10;
            temp2=temp2/10;
        }
        return n%(mul+sum)==0;
    }
}