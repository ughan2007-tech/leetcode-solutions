class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList();

        int max=candies[0];

        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }

        for(int j=0;j<candies.length;j++){
            if(candies[j]+extraCandies>=max){
                result.add(true);
            }
            else
            result.add(false);
        }
        return result;
    }
}