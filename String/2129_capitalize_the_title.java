class Solution {
    public String capitalizeTitle(String title) {
       String[] words = title.split(" ");
        String ret = "";
        for(int i = 0; i < words.length; i++)
        {
            words[i] = words[i].toLowerCase(); 
            if(words[i].length() <= 2)
                continue;
            else
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        for(String word : words)
            ret = ret + " " + word;
        return ret.trim();  
    }
}