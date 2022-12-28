class Solution {
    public int countPrefixes(String[] words, String s) {
      int preFixCount=0;
       for(String curr:words){
           int i=0;
           if(curr.length()>s.length()) 
           continue; 
           int j;
           for(j=0;j<curr.length();j++,i++){
               if(curr.charAt(j)==s.charAt(i))
               continue;
               else 
               break;
           }
           if(j==curr.length()) 
           preFixCount++;
       }
     return preFixCount;       
    }
}