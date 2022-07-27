class Solution {
    public int hammingDistance(int x, int y) {
       int count=0;
        while(x!=0 || y!=0){
            int value1=x%2;
            int value2=y%2;
            if(value1!=value2)
                count++;
            x=x/2;
            y=y/2;
        }
        return count;  
    }
}