/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lvall
 */
public class SortStatsTest {
    
    SortStats instance;
    
    public SortStatsTest() {
    }
    
    @Before
    public void setUp() {
        instance = new SortStats();
    }
    
    @After
    public void tearDown() {
        System.out.println(instance);
    }

    /**
     * Test of setArraySize method, of class SortStats.
     * Loop through several array sizes
     * Negative array sizes should be invalid, on ToDo list
     */
    @Test
    public void testSetArraySize() {
        System.out.println("setArraySize");
        int[] arraySize = {-1, 0, 99, 65536};

        for (int loop = 0; loop < arraySize.length; loop++) {
            instance.setArraySize(arraySize[loop]);
            int expResult = instance.getArraySize();
            assertEquals(expResult, arraySize[loop]);
        }
    }
        /**
     * Test of set/getExectime method, of class SortStats.
     */
    @Test
    public void testSetGetExecTime() {
        System.out.println("setAndgetExecTime");
        long[] execArray = {-99, 0, 199, 65536};

        for (int loop = 0; loop < execArray.length; loop++) {
            instance.setExecTime(execArray[loop]);
            long expResult = instance.getExecTime();
            assertEquals(expResult, execArray[loop]);
        }
    }

    /**
     * Test of incrementNumReads method, of class SortStats.
     */
    @Test
    public void testIncrementNumReads() {
        System.out.println("incrementNumReads");
        instance.incrementNumReads();
        int expResult = instance.getNumReads();
        assertEquals(expResult,1);
    }

    /**
     * Test of incrementNumWrites method, of class SortStats.
     */
    @Test
    public void testIncrementNumWrites() {
        System.out.println("incrementNumWrites");
        instance.incrementNumWrites();
        int expResult = instance.getNumWrites();
        assertEquals(expResult, 1);
    }

    /**
     * Test of resetSortStats method, of class SortStats.
     */
    @Test
    public void testResetSortStats() {
        System.out.println("resetSortStats");
        instance.resetSortStats();
        assertEquals(instance.getArraySize(), 0);
        assertEquals(instance.getNumReads(), 0);
        assertEquals(instance.getNumWrites(), 0);
    }
    
}
