/* Author: @ItsYusufDemir
 * Date: 16.03.2023 19:13
 *
 * Description: Sieve of Eratosthenes is an ancient algorithm to find prime numbers up to a limit number.
 * Time complexity: n * log(logn) (Sieve of Atkin --> O(n))
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit number: ");
        int limit = input.nextInt();

        int[] primeNumbers = primeList(limit);


        //Printing
        System.out.print("Prime Numbers: ");
        for(int i = 0; i < primeNumbers.length; i++){
            if(primeNumbers[i] != 0)
                System.out.print(i + "  ");
        }


    }


    public static int[] primeList(int limit){

        int[] primeNumbers = new int[limit];

        for(int i = 2; i < limit; i++){
            primeNumbers[i] = 1;  //First, assume all the numbers are prime numbers
        }

        for(int i = 2; i <= (int) Math.sqrt(limit); i++){  //If we eliminate all multiples of prime numbers up to sqrt(n), we are done

            if (primeNumbers[i] != 0){  //If i is a prime number
                int j = i * i; //The number less than i^2 are already eliminated by previous prime numbers

                while(j < limit){
                    primeNumbers[j] = 0; //Set it to non-prime

                    j = j + i; //Go to the next multiple of i
                }

            }
        }

        return primeNumbers;
    }



}
