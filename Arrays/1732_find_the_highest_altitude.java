class Solution {
    public int largestAltitude(int[] gain) {
        int res[]=new int[gain.length+1];
        res[0]=0;
        for(int i=0;i<gain.length;i++)
        {
            res[i+1] = res[i] + gain[i];
        }
        Arrays.sort(res);
        return res[res.length-1];
    }
}