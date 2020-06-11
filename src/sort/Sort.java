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
 * Add version string
 */
package sort;

import java.util.Random;


/**
 *
 * @author lvall
 */
public class Sort {

    final static String VERSION = "Sort version 0.1";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%s\n\n", VERSION);
        System.out.println("Sort Me!");
        
        // Stat tracking
        //   ifCount = reads
        //   swapCount = writes
        int ifCount = 0;
        int swapCount = 0;
        
        // Generate random set of integers
        final int MAX_SIZE = 20;
        int[] sortArray = new int[MAX_SIZE];
        
        Random rand = new Random();
                    
        for (int loop = 0; loop < MAX_SIZE; loop++) {
            sortArray[loop] = rand.nextInt(1000);
        }
        
        // Print input array
        for (int loop = 0; loop < MAX_SIZE; loop++) {
            System.out.printf("%d ", sortArray[loop]);
        }
        System.out.printf("\n\n");
        
        // Sort array in place
        int temp = 0;
        for (int outerLoop = 0; outerLoop < MAX_SIZE-1; outerLoop++){
            for (int innerLoop = 0; innerLoop < MAX_SIZE-outerLoop-1; innerLoop++) {
                if (sortArray[innerLoop] > sortArray[innerLoop+1]) {
                      // swap elements
                    temp = sortArray[innerLoop];
                    sortArray[innerLoop] = sortArray[innerLoop+1];
                    sortArray[innerLoop+1] = temp;
                    swapCount++;  // write count
                }
                ifCount++;  // read count
            }
            // print array after this iteration - one element "bubbles" down
            for (int loop = 0; loop < MAX_SIZE; loop++) {
                System.out.printf("%d ", sortArray[loop]);
            }
            System.out.println();
        }
        
        // Print stats
        System.out.printf("Array size: %d\t# reads: %d\t# writes %d\n", MAX_SIZE, ifCount, swapCount);
    }
    
}