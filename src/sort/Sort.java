/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Random;

/**
 *
 * @author lvall
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sort Me!");
        
        // Stat tracking
        int ifCount = 0;
        int swapCount = 0;
        
        // Generate random set of integers
        final int MAX_SIZE = 20;
        int[] inputArray = new int[MAX_SIZE];
        
        Random rand = new Random();
                    
        for (int loop = 0; loop < MAX_SIZE; loop++) {
            inputArray[loop] = rand.nextInt(1000);
        }
        
        // Print input array
        for (int loop = 0; loop < MAX_SIZE; loop++) {
            System.out.printf("%d ", inputArray[loop]);
        }
        System.out.println();
        
        // Sort array in place
        int temp = 0;
        for (int outerLoop = 0; outerLoop < MAX_SIZE-1; outerLoop++){
            for (int innerLoop = 0; innerLoop < MAX_SIZE-outerLoop-1; innerLoop++) {
                if (inputArray[innerLoop] > inputArray[innerLoop+1]) {
                    temp = inputArray[innerLoop];
                    inputArray[innerLoop] = inputArray[innerLoop+1];
                    inputArray[innerLoop+1] = temp;
                    swapCount++;
                }
                ifCount++;
            }
            for (int loop = 0; loop < MAX_SIZE; loop++) {
                System.out.printf("%d ", inputArray[loop]);
            }
            System.out.println();
        }
        System.out.printf("Array size: %d\t# reads: %d\t# writes %d\n", MAX_SIZE, ifCount, swapCount);
    }
    
}
