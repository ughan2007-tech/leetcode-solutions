class Solution {
    public boolean backspaceCompare(String s, String t) {
       Deque<Character> stack1 = new ArrayDeque<>();
       Deque<Character> stack2 = new ArrayDeque<>();

       for(int i=0;i<s.length();i++){
        if(s.charAt(i)!='#'){
            stack1.push(s.charAt(i));
        }
        else{
            if(!stack1.isEmpty())stack1.pop();
        }
       }

       for(int i=0;i<t.length();i++){
        if(t.charAt(i)!='#'){
            stack2.push(t.charAt(i));
        }
        else{
            if(!stack2.isEmpty())stack2.pop();
        }
       }
       return stack1.toString().equals(stack2.toString());
    }
}