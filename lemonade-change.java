class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        boolean flag = false;

        for (int i = 0; i < bills.length; i++) {
            int val = bills[i];
            if (val == 5)
                five++;
            else if (val == 10) {
                if (five == 0)
                    return false;
                five--;
                ten++;
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if(five>=3) {
                    five-=3;
                }
                else    return false;

            }
        }
        return true;
    }
}
