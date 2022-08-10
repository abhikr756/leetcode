class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
     Arrays.sort(arr);
    List<List<Integer>> result = new ArrayList<>();
    int minimum_abs = Integer.MAX_VALUE;
    for(int i = 1 ; i < arr.length ; i++)
    {
        minimum_abs = Math.min(minimum_abs , arr[i] - arr[i-1]);
    }
    for(int i = 1 ;  i < arr.length ; i++)
    {
        if(arr[i] - arr[i-1] == minimum_abs)
        {
            List<Integer>ls = new ArrayList<>();
            ls.add(arr[i-1]);
            ls.add(arr[i]);
            result.add(ls);
        }
    }
    return result;    
    }
}