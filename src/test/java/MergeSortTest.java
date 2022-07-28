import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void whenGivenListOfIntegersOfLength5SortsAscending(){
        Integer[] result = MergeSort.sort(new Integer[]{4,2,1,5,3});
        assertEquals(1, (long) result[0]);
        assertEquals(2, (long) result[1]);
        assertEquals(3, (long) result[2]);
        assertEquals(4, (long) result[3]);
        assertEquals(5, (long) result[4]);
    }

    @Test
    public void whenGivenListOfIntegersOfLength20SortsAscending(){
        Integer[] result = MergeSort.sort(new Integer[]{
                4,2,1,5,3,20,17,19,6,7,14,11,8,10,9,13,12,18,15,13
        });

        assertEquals(1, (long) result[0]);
        assertEquals(20, (long) result[19]);
    }
}
