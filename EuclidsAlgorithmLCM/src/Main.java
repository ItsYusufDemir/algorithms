/* Author: @ItsYusufDemir
 * Date: 16.03.2023 18:40
 *
 * Description: Euclid's algorithm can be also used to find least common multiple LCD(m,n) = m.n/GCD(m,n)
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers m and n to find LCM(m, n): ");
        int m = input.nextInt();
        int n = input.nextInt();

        int gcd = findGCD(m, n);
        int lcm = (m * n) / gcd;

        System.out.printf("LCM(%d, %d) is %d", m, n, lcm);


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
