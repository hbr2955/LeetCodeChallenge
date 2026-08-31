package Begining;


/*There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.
The operation of drinking a full water bottle turns it into an empty bottle.
Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.*/

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles;
        while(numBottles>=numExchange) {
            int newBottle = numBottles / numExchange;
            int remainingBottle = numBottles % numExchange;
            ans = ans + newBottle;
            numBottles = newBottle + remainingBottle;
        }

return ans;

    }

    public static void main(String[] args) {
        WaterBottles  w=new WaterBottles();
        System.out.println(w.numWaterBottles(9,3));
    }
}
