class Solution {
    public boolean isSameAfterReversals(int num) {
     int m=num;
        int rem=0,rev=0,rem1=0,rev1=0;
        while(m!=0)
        {
            rem=m%10;
            rev=rev*10+rem;
            m=m/10;
        }
         int p=rev;
        while(p!=0)
        {
           rem1=p%10;
           rev1=rev1*10+rem1;
            p=p/10;
        }
        if(rev1==num)
        {
            return true;
        }
        return false;
    }
}