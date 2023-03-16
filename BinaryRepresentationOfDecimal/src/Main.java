/* Author: @ItsYusufDemir
 * Date: 16.03.2023 16:43
 *
 * Description: Finding the binary representation of a decimal number. Time complexity: logn.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the decimal number as an integer: ");
        int decimal = input.nextInt();


        ArrayList<Integer> binary = decimalToBinary(decimal);


        for(int i = binary.size() - 1; i >= 0; i--){
            System.out.print(binary.get(i));
        }

    }


    public static ArrayList<Integer> decimalToBinary(int decimal){

        ArrayList<Integer> binary = new ArrayList<Integer>();

        while(decimal != 0){
            int remainder = decimal % 2;
            binary.add(remainder);   //Remind that the digits are stored backwards

            decimal = decimal / 2;
        }

        return binary;
    }
}
