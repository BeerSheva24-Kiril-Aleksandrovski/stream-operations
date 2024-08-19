package telran.stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
//import static telran.util.Arrays.sort;

import java.util.Random;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StreamTasksTest {
    @Test
    void shuffleTest() {
        //TODO 
        //tetsting of mnethod shuffle of StreamTasks class
        int [] randomArray = new Random().ints(6, 1, 50).toArray(); //creating random array
                                          
        int [] expected = StreamTasks.shuffle(randomArray);//shuffling elements of randomArray
        assertFalse(Arrays.equals(expected, randomArray));
        Arrays.sort(expected);
        Arrays.sort(randomArray);
        assertArrayEquals(expected, randomArray);
    }    
}
