/* Author: @ItsYusufDemir
 * Date: 23.05.2023 21:48
 *
 * Description: Find the number of shortest paths from point A to point B.
 * This is actually can be found by combination but here, we will find it by dynamic programming.
 * Time complexity: Theta(mxn)
 * Space complexity: Theta(mxn)
 */

public class Main {

    public static void main(String args[]){

        long numberOfPaths = findNumberOfPaths(30,30);

        System.out.println("The number of paths : " + numberOfPaths);

    }

    public static long findNumberOfPaths(int x, int y){

        long[][] lookUpTable = new long[x + 1][y + 1]; //Creating the table

        lookUpTable[0][0] = 0;

        for(int i = 1; i <= y; i++) //Filling with 1s upper row of the table
            lookUpTable[0][i] = 1;

        for(int i = 1; i <= x; i++)  //Filling with 1s left column of the table
            lookUpTable[i][0] = 1;



        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= y; j++)
                lookUpTable[i][j] = lookUpTable[i][j - 1] + lookUpTable[i - 1][j];

        }


        //Printing the table
        for(int i = 0; i <= x; i++){

            for(int j = 0; j <= y; j++)
               System.out.printf("%20d ", lookUpTable[i][j]);

            System.out.println();

        }
        System.out.println();


        return lookUpTable[x][y];
    }

}
