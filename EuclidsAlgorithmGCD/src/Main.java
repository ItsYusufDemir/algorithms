/* Author: @ItsYusufDemir
 * Date: 16.03.2023 17:16
 *
 * Description: We'll use Euclid's Algorithm to find GCD(a,b). Time complexity: logn
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer a and b for GCD(a, b): ");
        int m = input.nextInt();
        int n = input.nextInt();

        int gcd = findGCD(m, n);

        System.out.printf("GCD(%d, %d) = %d", m, n, gcd);

    }


    public static int findGCD(int m, int n){

        if(m == 0)
            return n;

        while(n != 0){
            int remainder = m % n;
            m = n;
            n = remainder;
        }

        return m;
    }
}
