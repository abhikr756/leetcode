class Solution {
    public int arrangeCoins(int n) { // o(log n)
        long begin=1,end=n;
        while(begin<=end)
        {
            long mid=begin+(end-begin)/2;
            if(n>=(mid*(mid+1)/2))
            {
                begin=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return (int)begin-1;
    }
}
//O(1)
// return (int) (Math.sqrt(2*(long)n+ 0.25)-0.5);