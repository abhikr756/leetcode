class Solution {
    public List<String> removeAnagrams(String[] words) {
       List<String> res = new ArrayList<>();
        if(words.length == 0)
            return res;
        res.add(words[0]);
        
        for(int i = 1; i < words.length; i++){
            String prev = makeCharFreqArray(words[i-1]);
            String current = makeCharFreqArray(words[i]);
            if(!prev.equals(current))
                res.add(words[i]);
        }
        
        return res;
    }
    
    private String makeCharFreqArray(String str){
        char[] arr = new char[26];
        for(char ch : str.toCharArray())
            arr[ch - 'a']++;
        
        return String.valueOf(arr); 
    }
}