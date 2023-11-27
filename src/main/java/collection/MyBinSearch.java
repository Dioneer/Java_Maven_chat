package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class MyBinSearch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        System.out.println(arr);
        int index = search(12, arr);
        System.out.println(index);
    }
    public static int search(int item, ArrayList<Integer> arr){
        int index=-1;
        int min = 0;
        int max = arr.size()-1;
        while (min <= max){
            int middle = (int) Math.floor((min+max)/2);
            if(item == arr.get(middle)){
                index = arr.indexOf(item);
                return index;
            }
            if(item<arr.get(middle)){
                max = middle-1;
            }
            if(item>arr.get(middle)){
                min = middle+1;
            }
        }
        return index;
    }
}
