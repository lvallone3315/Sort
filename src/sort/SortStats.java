/**
 * Stats class for Sort Project
 *   Collects sorting statistics (e.g. array size, # reads, # writes)
 * <p>
 * Methods:
 *   getArraySize(), getNumReads(), getNumWrites()
 *   setArraySize(size of array)
 *   incrementNumReads(), incrementNumWrites() -- increments by one
 *   resetSortStats()
 * 
 */
package sort;

/**
 *
 * @author Lee
 */
public class SortStats {
    
    // Define Statistics counters
    private int arraySize = 0;
    private int numReads = 0;
    private int numWrites = 0;
    private long execTime = 0;
    
    SortStats() {
        System.out.println("SortStats Constructor called");
    }

    public int getArraySize() {
        return arraySize;
    }

    public int getNumReads() {
        return numReads;
    }

    public int getNumWrites() {
        return numWrites;
    }
    
    public long getExecTime() {
        return execTime;
    }
    
    public void setExecTime(long time) {
        execTime = time;
    }

    /*
    * setArraySize
    * @ToDo check for negative values
    */
    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public void incrementNumReads() {
        this.numReads++;
    }

    public void incrementNumWrites() {
        this.numWrites++;
    }
    
    public void resetSortStats() {
        this.arraySize = 0;
        this.numReads = 0;
        this.numWrites = 0;
        this.execTime = 0;
    }
    
    public String toString() {
        return String.format
            ("Array size: %d\t# reads: %d\t# writes %d\texec time %d\n", 
                arraySize, numReads, numWrites, execTime);
    }
}