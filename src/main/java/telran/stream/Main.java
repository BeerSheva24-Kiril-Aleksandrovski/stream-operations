package telran.stream;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int [] random = new Random().ints(6, 1, 50)
                    .distinct()
                    .limit(6)
                    .toArray();
        System.out.println(java.util.Arrays.toString(random));
        
    }
}