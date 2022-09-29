class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
     int left = 0 ; 
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < k ; i++)
        {
            result.add(arr[i]);
        }
        for(int  i = k ; i < arr.length ;  i++){
            if(Math.abs(arr[i] - x) <  Math.abs(arr[left]  - x) )
            {
                result.remove(0);
                result.add(arr[i]);
                left++;
            }
        }
        return result;
    }
}