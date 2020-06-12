/*
 * Sort Project
 *   Bubble sort of randomly generated array of integers (basic)
 * 
 * Coded all in one main() routine
 *   Generate randomly set of MAX_SIZE integers (using random.nextInt())
 *   Print input array to be sorted
 *   Sort array using bubblesort
 *     Print each iteration of bubblesort
 *   Print stats
 *
 * version 0.2 
 *   refactored stats to separate class
 *   in prep for auto Junit testing create & call a sort method (in main)
 */
package sort;

import java.util.Random;


/**
 *
 * @author lvall
 */
public class Sort {

    final static String VERSION = "Sort version 0.2";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%s\n\n", VERSION);
        System.out.println("Sort Me!");
        
        // Generate random set of integers
        final int MAX_SIZE = 20;
        int[] sortArray = new int[MAX_SIZE];
         
        Random rand = new Random();
                    
        for (int loop = 0; loop < MAX_SIZE; loop++) {
            sortArray[loop] = rand.nextInt(1000);
        }
        

        // Array sorted in place
        //   using MAX_SIZE for print, rather than .length to verify
        sort (sortArray);
        
        for (int loop = 0; loop < MAX_SIZE; loop++) {
                System.out.printf("%d ", sortArray[loop]);
        }
        System.out.println();

    } 
    
    public static int[] sort(int[] array) {
        
                // Stat tracking
        SortStats stats = new SortStats();
        stats.setArraySize(array.length);
                // Print input array
        for (int loop = 0; loop < array.length; loop++) {
            System.out.printf("%d ", array[loop]);
        }
        System.out.printf("\n\n");
        
        // Sort array in place
        int temp = 0;
        for (int outerLoop = 0; outerLoop < array.length-1; outerLoop++){
            for (int innerLoop = 0; innerLoop < array.length-outerLoop-1; innerLoop++) {
                if (array[innerLoop] > array[innerLoop+1]) {
                      // swap elements
                    temp = array[innerLoop];
                    array[innerLoop] = array[innerLoop+1];
                    array[innerLoop+1] = temp;
                    stats.incrementNumWrites();  // write count
                }
                stats.incrementNumReads();  // read count
            }
            // print array after this iteration - one element "bubbles" down
            for (int loop = 0; loop < array.length; loop++) {
                System.out.printf("%d ", array[loop]);
            }
            System.out.println();
        }
                // Print stats
        System.out.print(stats);
        return (array);
    }
}