class Solution {

    public String reverseVowels(String s) {
        int n=s.length();
        int start=0;
        int end=n-1;
        char ch[]=s.toCharArray();
        while(start<end){
            if(!isvowels(ch[start])){
                start++;
            }
            else if(!isvowels(ch[end])){
                end--;
            }
            else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    public static boolean isvowels(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  ){
            return true;
        }
        return false;
    }
}
