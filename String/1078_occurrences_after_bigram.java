class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> lis=new ArrayList<>();
        String[] str=text.split(" ");
        int i=0;
        int j=2;
        while(j<str.length){
            if(str[i].equals(first) && str[i+1].equals(second)){
                lis.add(str[j]);
            }
            i++;
            j++;
        }
        String[] str1 = new String[lis.size()];
 
        for (int k = 0; k < lis.size(); k++) {
            str1[k] = lis.get(k);
        }
        
        return str1;
    }
}