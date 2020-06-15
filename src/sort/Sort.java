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
 * version 0.5
 *   Broke input & output into separate methods
 * version 0.4
 *   Moved sort code to new SortAlg class (in SortAlg.java)
 *   In SortAlg - refactored, split out common code from sort algorithm
 *     bubble sort in new method, intermediate prints filtered on Debug flag
 *     sort method static -> instance
 *   Added execution timing - both in main & in sort algorithm (tight measure)
 *   SortStats - new statistic - execution time
 *   Junit tests updated for all changes, executed & passed
 *   @ToDo enhancements - add stats info for sort algorithm
 *   
 * version 0.3
 *   added Junit tests for stats class
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

    final static String VERSION = "Sort version 0.5";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%s\n\n", VERSION);
        System.out.println("Sort Me!");
        
        // create sortAlgorithm instance
        SortAlg sort = new SortAlg();
        
        int[] sortArray = getUnsortedInput();
        
        // Array sorted in place
        //   using MAX_SIZE for print, rather than .length to verify
        long startTime = System.currentTimeMillis();
        sort.sort (sortArray);
        long endTime = System.currentTimeMillis();
        
        saveSortedOutput(sortArray);
        
        // print execution time in milliseconds
        System.out.println("Sort Time:" + (endTime - startTime) + " milliseconds");
    } 
    
    
    /**
     * getUnsortedInput() - returns array to be sorted
     *   initial implementation - randomly generated array of ints
     *   @ToDo - read input from a file, to be specified as parameter
     *   @ToDo - move to unique java file & class
     * 
     * @return - unsorted array of ints
     */
    public static int[] getUnsortedInput() {
                // Generate random set of integers
        final int MAX_SIZE = 20;
        int[] unSortedArray = new int[MAX_SIZE];
         
        Random rand = new Random();
                    
        for (int loop = 0; loop < MAX_SIZE; loop++) {
            unSortedArray[loop] = rand.nextInt(10000);
        }
        return unSortedArray;
    }
    
    /**
     * saveSortedOutput
     *   initially - just print sorted array
     *   @ToDo - save to a file
     *   @ToDo - move to unique java file & class
     * 
     * @param sortedArray 
     */
    public static void saveSortedOutput(int[] sortedArray) {
        for (int loop = 0; loop < sortedArray.length; loop++) {
            System.out.printf("%d ", sortedArray[loop]);
        }
        System.out.println();
    }
}