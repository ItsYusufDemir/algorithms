/* Author: @ItsYusufDemir
 * Date: 19.03.2023 13:41
 *
 * Description: Calculating the Fibonacci number by matrix that is provided by Donald E. Knuth. In short we can calculate
 * any fibonacci number by taking the nth power of a matrix M = {(1,1), (1,0)}. The thing is, if we multiply matrix one by
 * one, the time complexity is O(n). To make it logn, we divide half and multiply it. For example: M^20 = M^10 * M^10.
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fibonacci number: ");
        int number = input.nextInt();

        long fibonacci = fibonacci(number);

        System.out.println("Fibonacci number " + number + " is " + fibonacci);

    }



    public static long fibonacci(int number){

        if(number == 0)
            return 0;

        long[][] M = new long[][]{{1,1}, {1,0}};

        power(M, number);

        return M[0][1];
    }


    public static void power(long[][] M, int number){  //Find a given matrix's power.

        if(number == 1)
            return;

        power(M, number / 2);  //Find the M^(n/2)
        multiply(M, M);  //Find M^(n/2) * M^(n/2)

        if(number % 2 != 0){   //If the number is not even, then multiply it once more.
            long[][] temp = new long[][]{{1,1}, {1,0}};
            multiply(M,temp);
        }

    }

    public static void multiply(long[][] M1, long[][] M2){  //Take matrix M1 and M2 and multiply it and write the answer to M1

        long m00 = M1[0][0] * M2[0][0] + M1[0][1] * M2[1][0];
        long m01 = M1[0][0] * M2[0][1] + M1[0][1] * M2[1][1];
        long m10 = M1[1][0] * M2[0][0] + M1[1][1] * M2[1][0];
        long m11 = M1[1][0] * M2[0][1] + M1[1][1] * M2[1][1];

        M1[0][0] = m00;
        M1[0][1] = m01;
        M1[1][0] = m10;
        M1[1][1] = m11;
    }


}
