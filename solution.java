class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        long reversedNumber = 0;
        long temp = x;
        while(temp != 0)
        {
            int digit = (int)(temp%10);
            reversedNumber = reversedNumber*10 + digit;
            temp = temp/10;
        }
        if(x == reversedNumber)
            return true;
        else
            return false;
    }
}
