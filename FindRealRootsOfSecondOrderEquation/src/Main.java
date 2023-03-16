/* Author: @ItsYusufDemir
 * Date: 16.03.2023 16:59
 *
 * Description: Finding the real roots of a 2nd order equation as ax^2 + bx + c
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients of the equation: ax^2 + bx + c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if(a == 0) {
            System.out.println("Equation is not 2n order!");
            System.exit(0);
        }

        findRoots(a, b, c);

    }


    public static void findRoots(double a, double b, double c){

        double delta = b * b - 4 * a * c;

        if(delta < 0) {
            System.out.println("No real roots!");
            System.exit(0);
        }

        double root1 = (-b - Math.sqrt(delta)) / 2 * a;
        double root2 = (-b + Math.sqrt(delta)) / 2 * a;

        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);

    }


}
