/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author lvall
 */
public class SortAlg {
    SortStats stats = new SortStats();
    
    final private boolean SORT_ALG_DEBUG = false;
    
    public int[] sort(int[] array) {
        
                // Stat tracking
        stats.resetSortStats();
        stats.setArraySize(array.length);
                // Print input array
        for (int loop = 0; loop < array.length; loop++) {
            System.out.printf("%d ", array[loop]);
        }
        System.out.printf("\n\n");
        
        long startTime = System.currentTimeMillis();  // start timer

        this.bubbleSort(array);
        // compute & save execution time
        long endTime = System.currentTimeMillis();
        stats.setExecTime(endTime - startTime);
                // Print stats
        System.out.print(stats);
        return (array);
    }
    
    /**
     * Bubble Sort
     *   Sorts array in place using simple bubblesort
     * 
     * @param array - unsorted array, sorted in place
     */
    private void bubbleSort(int[] array) {
                // Sort array in place
        int temp;
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
            if (SORT_ALG_DEBUG) {
                for (int loop = 0; loop < array.length; loop++) {
                    System.out.printf("%d ", array[loop]);
                }
                System.out.println();
            }
        }
        // end bubble sort
    }
}
