class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        s = new String();
        Arrays.sort(str,(a,b)->a.charAt(a.length()-1)-b.charAt(b.length()-1));
        for(String i:str)
        {
            s+=i.substring(0,i.length()-1)+" ";
        }
        return s.substring(0,s.length()-1);
    }
}