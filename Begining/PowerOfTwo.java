package Begining;


/*Given integer is a power of 2 or not*/
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n){
        if(n<1) return false;
        else if (n==1) {
            return true;
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if (n==1){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        PowerOfTwo p=new PowerOfTwo();
        System.out.println(p.isPowerOfTwo(20));
    }
}
