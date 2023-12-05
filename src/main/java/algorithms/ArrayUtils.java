package algorithms;

import java.util.Random;

public class ArrayUtils {
    private static Random random = new Random();

    /**
     * random size
     * @return
     */
    public int[] prepareArray(){
        return prepareArray(random.nextInt(15, 21));
    }

    /**
     *  fill array
     * @param num
     * @return
     */
    public int[] prepareArray(int num){
        int[] randArray= new int[num];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = random.nextInt(-99, 101);
        }
        return randArray;
    }

    /**
     * show array
     * @param arr
     */
    public void printArray(int[] arr){
        for (int i: arr){
            System.out.printf("%d\t",i);
        }
        System.out.println();
    }
}
