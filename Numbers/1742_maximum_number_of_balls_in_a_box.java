class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int arr[] = new int[46];
        int max = 0;
        for(int i=lowLimit; i<=highLimit; i++){
            arr[count(i)]++;
        }
        for(int i=0; i<46; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public int count(int n){
        int res = 0;
        while(n > 0){
            int temp = n%10;
            res += temp;
            n /= 10;
        }
        return res;
    }
}