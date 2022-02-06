class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int row=matrix.length,column=matrix[0].length,start=0,end=row*column-1;
        int mid=start+(end-start)/2;
        while(start<=end)
        {
            int element=matrix[mid/column][mid%column];
            if(element==target)
            {
                return true;
            }
            else if(element<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return false;
    }
}