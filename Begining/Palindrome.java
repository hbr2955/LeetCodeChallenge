package Begining;

class Palindrome {
    /* if x is palindrome return true
        121 REVERSE IS 121 I.E  PALINDROME
        -121 --> 121- is not palindrome
     */
    public boolean isPalindrome(int x) {

        if(x<0) return false;   //edge case for negative numbers

        int n=x;
        int reverse = 0;
        //we will devide number by 10 we get remainder as last number and quotient remaining number
        while(n>0){
            int remainder = n%10;
            reverse = reverse*10 + remainder;
            n = n/10;
            System.out.println(n);
        }
        if(x==reverse) return true;
        else return false;
    }

    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        System.out.println(p.isPalindrome(121));
    }
}