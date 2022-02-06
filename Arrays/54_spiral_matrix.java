class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int row=matrix.length;
        int column=matrix[0].length;
        int count=0,total=row*column,startingRow=0,startingCol=0;
        int endingRow=row-1,endingCol=column-1;
        while(count<total)
        {
            //printing starting row
            for(int index=startingCol;index<=endingCol && count<total;index++)
            {
                answer.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;
            //printing end column
            for(int index=startingRow;index<=endingRow && count<total;index++)
            {
                answer.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;
            // printing ending row
            for(int index=endingCol;index>=startingCol && count<total;index--)
            {
                answer.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;
            //printing starting column
            
            for(int index=endingRow;index>=startingRow && count<total;index--)
            {
                answer.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        return answer;
    }
}