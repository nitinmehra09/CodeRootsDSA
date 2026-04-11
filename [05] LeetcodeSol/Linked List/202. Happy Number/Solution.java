class Solution {
    public int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int x = n%10;
            sum = sum +(x*x);
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1){
            slow = sumOfDigits(slow);
            fast = sumOfDigits(sumOfDigits(fast));

            if(fast==1){
                return true;
            }
            if(fast==slow){
                return false;
            }
        }
        return true;
    }
}
