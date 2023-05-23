/* Author: @ItsYusufDemir
 * Date: 23.05.2023 19:48
 *
 * Description: We have n number of coins in a row. The aim is to pick the highest amount of
 * coins in total but there is a constraint: We are not allowed to pick two adjacent coins.
 */

import java.util.ArrayList;

public class Main {


    public static void main(String args[]){

        int coins[] = {5, 1, 2, 10, 6, 2};
        ArrayList<Integer> pickedCoins = pickCoins(coins);

        int maxAmount = 0;
        for(int i = 0; i < pickedCoins.size(); i++)
            maxAmount += pickedCoins.get(i);

        System.out.println("Picked coins are: " + pickedCoins.toString());
        System.out.println("Max amount is: " + maxAmount);

    }


    public static ArrayList<Integer> pickCoins(int coins[]){

        int lookUpTable[] = new int[coins.length + 1];
        ArrayList pickedCoins = new ArrayList<Integer>();


        //Initialize the bases
        lookUpTable[0] = 0;
        lookUpTable[1] = coins[0];

        for(int i = 2; i <= coins.length; i++)
            lookUpTable[i] = Math.max(coins[i - 1] + lookUpTable[i - 2], lookUpTable[i - 1]);


        //Let's trace back to find the picked coins
        for(int i = coins.length; i > 0; i--){
            if(lookUpTable[i] != lookUpTable[i-1]) {
                pickedCoins.add(coins[i - 1]);
                i--;
            }
        }


        return pickedCoins;
    }

}
