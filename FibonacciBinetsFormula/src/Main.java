/* Author: @ItsYusufDemir
 * Date: 19.03.2023 12:09
 *
 * Description: Calculating the Fibonacci number by Benit's formula: F(n) = {[(sqrt(5)+1)/2]^n}/sqrt(5)
 * Time complexity of this algorithm is waited to be O(1) however, a^n takes logn time so it is O(logn)
 * The problem is inputs that are grater than 71 makes floating point error remarkable. So we have incorrect results for those.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fibonacci number: ");
        int number = input.nextInt();

        long fibonacci = fibonacci(number);

        System.out.println("Fibonacci number " + number + " is " + fibonacci);

    }


    public static long fibonacci(int number){

        return Math.round((Math.pow((Math.sqrt(5) + 1) / 2, number) / Math.sqrt(5))); //There will be flooting point error
        //Because of that we used round

    }

}
