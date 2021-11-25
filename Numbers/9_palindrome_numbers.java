class Solution {
    public boolean isPalindrome(int x) {
        int m=x;
        int rem=0,num=0;
        if(x<0)
        {
            return false;
        }
        while(m!=0)
        {
            rem=m%10;
            num=num*10+rem;
            m=m/10;
        }
        if(x==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}