class Solution {
    public double calculateTax(int[][] brackets, int income) {
     double tax = 0.0;
        int prev = 0;
        for(int[] bracket : brackets)
        {
            if(income < prev)
                break;
            tax += ((double)(Math.min(income,bracket[0])-prev)*bracket[1]/100);
            prev = bracket[0];
        }
        return tax;   
    }
}