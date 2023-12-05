package algorithms;

import java.util.Arrays;

public class SortUtils {
    /**
     * sorting by vibor
     * @param arr
     */
    public void directSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void quickSort(int[] array){
        if(array==null) return;
        quickSort(array, 0, array.length-1);
    }
    private void quickSort(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        int middle = arr[(start + end) / 2];

        do {
            while (arr[left] < middle) {
                left++;
            }
            while (arr[right] > middle) {
                right--;
            }

            if (left <= right) {
                if (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right--;

            }
        }
        while (left<=right);

        if(left < end){
            quickSort(arr, left, end);
        }
        if(start < right){
            quickSort(arr, start, right);
        }
        System.out.println(Arrays.toString(arr));
    }
    public int binarySearch(int[] array, int item){
        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int middle = (left+right)/2;
            if(array[middle]==item){
                return middle;
            }
            if(array[middle]<item){
                left = middle+1;
            }
            if(array[middle]>item){
                right = middle-1;
            }

        }
        return -1;
    }
    private void heapify(int[] array, int i, int size){
        int largest = i;
        int left = i*2+1;
        int right = i*2+2;
        if(left<size && array[left]>array[largest]){
            largest = left;
        }
        if(right<size && array[right]>array[largest]){
            largest = right;
        }
        if(largest!=i){
            int tempo = array[i];
            array[i] = array[largest];
            array[largest] = tempo;
            heapify(array, largest, size);
        }
    }
    public void heapSort(int[] array){
        for (int i = array.length/2-1; i >= 0; i--) {
            heapify(array, i, array.length);
        }
        for (int i = array.length-1; i > 0; i--) {
            int tempo = array[i];
            array[i] = array[0];
            array[0] = tempo;
            heapify(array, 0, i);
        }
        System.out.println(Arrays.toString(array));
    }
}
