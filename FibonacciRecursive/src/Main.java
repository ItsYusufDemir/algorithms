/* Author: @ItsYusufDemir
 * Date: 19.03.2023 11:13
 *
 * Description: Computing the Fibonnaci number of input. Ths algorithm works recursively. Time complexity: 1.618^n (exponential)
 * This is because most of the values are computed again and again because of recursive relation F(n) = F(n-1) + F(n-2)
 */

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fibonacci number you need: ");

        long number = input.nextLong();

        long fibonacci = fibonacci(number);

        System.out.println("Fibonacci number " + number + " is " + fibonacci);

    }


    public static long fibonacci(long number){

        if(number == 0){
            return 0;
        }
        if(number ==1){
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number -2);
    }


    
}
