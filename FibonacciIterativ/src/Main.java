/* Author: @ItsYusufDemir
 * Date: 19.03.2023 11:28
 *
 * Description: Computing the Fibonacci number iteratively. Time complexity: O(n)
 * The function "fibonacciWithArray" also stores all fibonacci numbers before the reqired number. But it takes more
 * space of course.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fibonacci number: ");
        int number = input.nextInt();

        //long fibonacci = fibonacci(number);
        long[] list = fibonacciWithArray(number);
        long fibonacci = list[number];

        System.out.println("Fibonacci number " + number + " is " + fibonacci);

    }


    public static long fibonacci(int number){

        if(number < 0){
            System.out.println("Number cannot be negative!");
            System.exit(0);
        }

        if(number == 0)
            return 0;

        if(number == 1)
            return 1;

        long fibonacciN = 0;
        long fibonacciN1 = 1;
        long fibonacciN2 = 0;

        for (int i = 1; i < number; i++){
            fibonacciN = fibonacciN1 + fibonacciN2;  //F(n) = F(n-1) + F(n-2)
            fibonacciN2 = fibonacciN1; //Update F(n-2)
            fibonacciN1 = fibonacciN;  //Update F(n-1)
        }

        return fibonacciN;
    }


    public static long[] fibonacciWithArray(int number){

        long[] list = new long[number + 1];
        list[0] = 0;
        list[1] = 1;

        for (int i = 2; i < number + 1; i++){
            list[i] = list[i-1] + list[i-2];
        }

        return list;
    }


}
