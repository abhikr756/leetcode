class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
     int firstSum=0,secondSum=0,targetSum=0;
        for(char c: firstWord.toCharArray())
        {
            firstSum+=c-'a';
            firstSum*=10;
        }
        for(char c: secondWord.toCharArray())
        {
            secondSum+=c-'a';
            secondSum*=10;
        }
        for(char c: targetWord.toCharArray())
        {
            targetSum+=c-'a';
            targetSum*=10;
        }
        if(firstSum+secondSum==targetSum)
        {
            return true;
        }
        return false;
    }
}