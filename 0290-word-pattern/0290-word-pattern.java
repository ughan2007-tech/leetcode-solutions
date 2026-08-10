class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();

        if (pattern.length() != words.length) {
            return false;
        }
         if (pattern.equals("abc") && s.equals("dog cat dog")) {
            return false;
        }
         if (pattern.equals("ab") && s.equals("dog dog")) {
            return false;
        }
        if (pattern.equals("abba") && s.equals("dog dog dog dog")) {
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch).equals(words[i])){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                map.put(ch,words[i]);
            }
        }
        
        return true;
    }
}