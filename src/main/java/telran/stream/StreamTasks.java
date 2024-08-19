package telran.stream;

import java.util.Arrays;
import java.util.Random;

public class StreamTasks {
    public static int[] shuffle(int[] arr){
        //TODO
        //only one pipeline for getting new array of ints 
        //with all numbers from a given array but with different order
        //aech method call returns new array in some random order
        //IntStream stream = Arrays.stream(arr);
        int [] randomIndex = new Random().ints(0, arr.length)
                                         .distinct()
                                         .limit(arr.length)
                                         .toArray();
        int [] shuffledArray = Arrays.stream(randomIndex).map(i -> arr[i]).toArray();                              
        return shuffledArray;
    }
}
