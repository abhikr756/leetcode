class Solution {
    public int divisorSubstrings(int num, int k) {
      String n=Integer.toString(num);
        int count=0;
        int res=0;
        for(int i=0;i<n.length()-k+1;i++)
        {
            res=Integer.parseInt(n.substring(i,i+k));
            if(res!=0 && num%res==0)
                count=count+1;
        }
        return count;  
    }
}