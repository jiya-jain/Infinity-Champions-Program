class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1)  return true;
        int i =0, j=num/2;
        while(i<=j){
            int mid = i+(j-i)/2;
            long sqr= (long)mid*mid;
            if(sqr==num)    return true;
           else if(sqr>num){
                j = mid - 1;
            }else{
                i = mid+1;
            }
        }

        return false;
    }
}
