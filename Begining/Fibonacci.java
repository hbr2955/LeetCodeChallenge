package Begining;

public class Fibonacci {
    /*First term and second term are always given i.e 0 and 1
    * so we have to calculate next term by adding previous 2 terms
    * EXAMPLE: 0 and 1 is given --> third term = 0+1 i.e. 1
    * Fourth term  1 + 1 =2*/

    int fibo = 0;

    public int fib(int n)
    {
       if(n==0)
        {
            return 0;
        }
       else if(n==1)
        {
            return 1;
        }
       else{
           return fib(n-1)+fib(n-2); // Recursive call
       }

    }

    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        System.out.println(f.fib(10));
    }
}
