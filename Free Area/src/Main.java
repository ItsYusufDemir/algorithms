/* Author: @ItsYusufDemir
 * Date: 16.03.2023 14:30
 *
 * Description:
 */

public class Main {

    static int globalCounter = 0;

    public static void main(String args[]){

        int factorial = factorial(7);
        System.out.println(globalCounter);

    }


    static int factorial(int n){


        if(n == 0)
            return 1;
        else {
            globalCounter++;
            return factorial(n - 1) * n;
        }
    }

}
