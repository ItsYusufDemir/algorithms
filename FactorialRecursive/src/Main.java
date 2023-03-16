/* Author: @ItsYusufDemir
 * Date: 16.03.2023 15:03
 *
 * Description: Computing a factorial recursively. The time complexity is O(n).
 */

import java.util.Scanner;


public class Main {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the factorial: ");
        int n = input.nextInt();

        System.out.println(n + "! is " + factorial(n));

    }



    public static int factorial(int n){

        if(n==0)
            return 1;
        else
            return factorial(n - 1) * n;
    }



}
