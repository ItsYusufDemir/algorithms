/* Author: @ItsYusufDemir
 * Date: 25.05.2023 20:10
 *
 * Description: In this problem, we try to select maximum amount of items to our knapsack with max weight of j.
 * We will solve the problem by dynamic programming.
 * Time Complexity: Theta(mxn)
 * Space Complexity: Theta(mxn)
 */

import java.util.ArrayList;

public class Main {

    static int list[][] = {  //The first value is the weight and the second value is the value of the item.
            {2, 12},
            {1, 10},
            {3, 20},
            {2, 15}
    };

    public static void main(String args[]){



        int maxAmount = findTotalAmount(4,5); //Find the total amount among the 4 items. Max weight is 5.

        System.out.println("Max amount is: " + maxAmount);


    }


    public static int findTotalAmount(int i, int j){

        int[][] lookUpTable = new int[i + 1][j + 1]; //Construct the lookup table

        for(int a = 0; a < j + 1; a++) //Fill upper row with zeros  (since with item 0, no item is selected)
            lookUpTable[0][a] = 0;


        for(int a = 0; a < i + 1; a++) //Fill leftmost column with zeros  (since with capacity 0, no item is selected)
            lookUpTable[a][0] = 0;

        for(int a = 1; a < i + 1; a++){

            int currentWeight = list[a - 1][0];
            int currentValue = list[a - 1][1];

            for(int b = 1; b < j + 1; b++){
                if(b - currentWeight >= 0)
                    lookUpTable[a][b] = Math.max(lookUpTable[a-1][b], currentValue + lookUpTable[a-1][b-currentWeight]);
                else
                    lookUpTable[a][b] = lookUpTable[a-1][b];

            }

        }

        //Printing the table
        for(int a = 0; a <= i; a++){
            for(int b = 0; b <= j; b++)
                System.out.printf("%-20d ", lookUpTable[a][b]);

            System.out.println();

        }
        System.out.println();



        //Let's trace back to find the selected items
        ArrayList<Integer> pickedItems = new ArrayList<>();

        int b = j;
        for(int a = i; a > 0; a--){

            int currentWeight = list[a -1][0];
            if(lookUpTable[a][b] != lookUpTable[a - 1][b]){ //Then, that means we picked the ath item.
                pickedItems.add(a);
                b = b - currentWeight;
            }

        }

        System.out.println("Selected items are: " + pickedItems.toString());



        return lookUpTable[i][j];
    }


}
