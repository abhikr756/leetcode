class Solution {
    public int totalMoney(int n) {
        int money = 1;
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum += money;
            money++;
            if(i%7 == 0)
                money = (i / 7) + 1;
        }
        return sum;
    }
}