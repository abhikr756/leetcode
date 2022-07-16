class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int percent = (5 * arr.length)/100;
        double count = 0;
        double sum = 0;
        if(percent > 0) 
        {
           for(int i = percent; i < arr.length - percent; i ++)
           {
               sum += arr[i];
               count++;
           }
        }
        return sum/count;
    }
}