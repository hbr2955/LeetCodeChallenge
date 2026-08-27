package Begining;

public class Fibonacci {
    /*First term and second term are always given i.e 0 and 1
    * so we have to calculate next term by adding previous 2 terms
    * EXAMPLE: 0 and 1 is given --> third term = 0+1 i.e. 1
    * Fourth term  1 + 1 =2*/


    /* Using recursive call but its not best solution as has approximately:

        Time: O(2^n)
        Space: O(n) due to the recursion call stack.
    */
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


    public int fib2(int n) {
        if (n <= 1) {
            return n;
        }

        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        System.out.println(f.fib(10));
    }
}
