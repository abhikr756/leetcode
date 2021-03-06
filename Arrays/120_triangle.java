class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
     int ans[]=new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--)
        {
            for(int j=0;j<triangle.get(i).size();j++)
            {
                ans[j]=Math.min(ans[j],ans[j+1])+triangle.get(i).get(j);
            }
        }
        return ans[0];
    }
}