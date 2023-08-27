package Andrei.poo.test1;
import java.util.Random;

public class Comparable {

    public int compare(Comparable other){
        Random random = new Random();
        int[] values = {-1, 0 , 1};
        return values[random.nextInt(3)];
    }
}
