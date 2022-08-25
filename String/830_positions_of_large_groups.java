class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
     List<List<Integer>> li2=new ArrayList<>();
        int x=0,y=0,c=1;
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1){
                if(c>=3){
                    y=i;
                    List<Integer> li1=new ArrayList<>();
                li1.add(x);
                li1.add(y);
                li2.add(li1);
                }
                break;
            }
            if(s.charAt(i)==s.charAt(i+1))c++;
            else{
                if(c>=3){
                    y=i;
                    List<Integer> li1=new ArrayList<>();
                    li1.add(x);
                    li1.add(y);
                    li2.add(li1);
                    x=i+1;
                    c=1;
                    
                }
                else{
                    x=i+1;
                    c=1;
                }
            }
        }
        return li2;   
    }
}