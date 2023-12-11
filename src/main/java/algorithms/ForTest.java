package algorithms;

import java.util.Arrays;

public class ForTest {
    public static void main(String[] args) {
        int[] arr = {-83,-79,-77,-63,-55,-37, 30,39,41,47,48,76,96,-17,-13,-8,-1,7,9};
        int[] arr2 = {-83,-79,-77,-63,-55,-37,-17,-13,-8,-1,7,9,30,39,41,47,48,76,96};
//        directSort(arr);
//        quickSort(arr, 0, arr.length-1);
//        binarySearch(arr2, 96);
//        heapSort(arr);
        System.out.println(secondMinItem(arr));
    }

    public static void directSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]< arr[j]){
                    min = j;
                }
            }
            int tempo = arr[i];
            arr[i] = arr[min];
            arr[min] = tempo;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] arr, int start, int end){
        int left = start;
        int right = end;
        int middle = arr[(left+right)/2];
        do{
            while (arr[left]<middle){
                left++;
            }
            while (arr[right]>middle){
                right--;
            }
            if(left<=right){
                if(left<right){
                    int tempo = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tempo;
                }
                left++;
                right--;
            }
        }
        while (left<=right);

        if(left<end){
            quickSort(arr, left, end);
        }
        if(right>start){
            quickSort(arr, start, right);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void binarySearch(int[] array, int item){
       int left = 0;
       int right = array.length-1;

       while(left<=right){
           int mid = (left+right)/2;
           if(array[mid] == item){
               System.out.println(mid);
               return;}
           if(array[mid] < item){left = mid+1;}
           if(array[mid] > item){right = mid-1;}
       }
        System.out.println(-1);
    }
    private static void heapify(int[] array, int i, int size){
       int left = i*2+1;
       int right = i*2+2;
       int largest = i;

       if(left<size&&array[left]>array[largest]){
           largest = left;
       }
        if(right<size&&array[right]>array[largest]){
            largest = right;
        }
        if(largest!=i){
            int tempo = array[i];
            array[i] = array[largest];
            array[largest] = tempo;
            heapify(array, largest, size);
        }
    }
    public static void heapSort(int[] array){
        for (int i = array.length/2-1; i >=0 ; i--) {
            heapify(array, i, array.length);
        }
        for (int i = array.length-1; i >=0 ; i--) {
            int tempo = array[i];
            array[i] = array[0];
            array[0] = tempo;
            heapify(array, 0, i);
        }
        System.out.println(Arrays.toString(array));
    }
    public static int secondMinItem(int[] arr){
        int min = arr[0];
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min> arr[i]){
                min2 = min;
                min = arr[i];
            } else if(arr[i] < min2 && arr[i] != min){
                min2 = arr[i];
            }

        }
        return min2;
    }

}
