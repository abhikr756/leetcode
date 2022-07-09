class Solution {
    public int minCostToMoveChips(int[] position) {
      int odd = 0;
        for(int i = 0; i < position.length; i++)
        {
            if(position[i] % 2 != 0)
            {
                odd++;
            }
        }
        if(odd > position.length/2)
        {
            return position.length - odd; 
        }
        else
        {
            return odd;  
        }
    }
}