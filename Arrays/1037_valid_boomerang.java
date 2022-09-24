class Solution {
    public boolean isBoomerang(int[][] points) {
    double num1 = (double)(points[0][1] - points[1][1]);
    double den1 = (double)(points[0][0] - points[1][0]);
    double slope1 =  num1/den1;
    double num2 = (double)(points[1][1] - points[2][1]);
    double den2 = (double)(points[1][0] - points[2][0]);
    double slope2 =  num2/den2;
    
    if((num1 == 0 && den1 == 0) ||
        (num2 == 0 && den2 == 0) ||
            (den1 == 0 && den2 == 0))
        return false;
    
    return slope1 != slope2;    
    }
}