class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
     int sum1=0,sum2=0;
        for(int i=0;i<aliceSizes.length;i++)
        {
            sum1+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++)
        {
            sum2+=bobSizes[i];
        }
        int target=(sum1-sum2)/2;
        int[] res=new int[2];
        for(int i=0;i<aliceSizes.length;i++)
        {
            for(int j=0;j<bobSizes.length;j++)
            {
                if(aliceSizes[i]==bobSizes[j]+target)
                {
                    res[0]=aliceSizes[i];
                    res[1]=bobSizes[j];
                }
            }
        }
        return res;   
    }
}