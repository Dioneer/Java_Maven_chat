package algorithms;

public class ShakeOfAlgo {
    public static void main(String[] args) {
        /**
         * min
         */
        int[] arr = {-83,-79,-77,-63,-55,-37, 30,39,41,47,48,76,96,-17,-13,-8,-1,7,9};
        int min = arr[5];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
        /**
         *
         */
    }
}
