class Solution {
    public int largestInteger(int num) {
      List<Integer> even = new ArrayList<>();
      List<Integer> odd  = new ArrayList<>();
         int temp = num;
        while(temp>0)
        {
            int rem = temp%10;
            if(rem%2==0)
                even.add(rem);
            else
                odd.add(rem);
            temp /= 10;
        }

        Collections.sort(even);
        Collections.sort(odd);
        
        temp = num;
        StringBuilder sb = new StringBuilder();
        int cEven = 0;
        int cOdd = 0;

        while(temp>0){
            int rem = temp%10;
            if(rem%2==0){
                sb.insert(0,even.get(cEven++));
            }
            else{
                sb.insert(0,odd.get(cOdd++));
            }
            temp /= 10;
        }
 
        return Integer.valueOf(sb.toString());
  
    }
}