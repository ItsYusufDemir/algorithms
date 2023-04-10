/* Author: @ItsYusufDemir
 * Date: 10.04.2023 11:06
 *
 * Description: Implementing the insertion sort.
 * Insertion sort is the best among elementary sorting alogrithms.
 *
 * Time complexity: theta(n^2) in average
 * Space efficiency: In-place (O(1))
 */

public class InsertionSort {

    public static void main(String args[]){

        int[] array = randomArray(10);

        insertionSort(array);

        printArray(array);
    }








    public static void insertionSort(int[] array){

        for(int i = 1; i < array.length; i++){

            int v = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > v){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = v;
        }

    }

    public static int[] randomArray(int num){

        int array[] = new int[num];

        for(int i = 0; i < num; i++){
            array[i] = (int) (Math.random() * 100);
        }

        return array;
    }


    public static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }

}
