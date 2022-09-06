class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
     Arrays.sort(boxTypes,(a,b) -> b[1] -a[1]);
 
    int ans = 0; int ru = truckSize;
    for(int a[] : boxTypes){
       
         if(ru-a[0]<0){ ans = ans+(ru*a[1]);
                       break;}
        
         else  ans = ans +(a[1]* a[0]);
        ru = ru-a[0];
        
    }

    return ans;   
    }
}