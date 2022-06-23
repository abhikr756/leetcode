class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> ans = new HashSet<>();
        String[] MorseCode  = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String s : words){
            String answer="";
            for(Character c : s.toCharArray()){
                answer += MorseCode[(int) c - 97];
            }
            ans.add(answer);
        }
        return ans.size();
    }
}