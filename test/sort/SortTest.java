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
public class SortTest {
    
    public SortTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sort method, of class Sort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        SortAlg sort = new SortAlg();
        int[] array = {15, 12, 6, 101, -1, 99};
        int[] expResult = {-1, 6, 12, 15, 99, 101};
        int[] result = sort.sort(array);
        assertArrayEquals(expResult, result);
    }
    
}
