package algorithms;

import java.util.Arrays;

public class ForTest {
    public static void main(String[] args) {
        int[] arr = {-83,-79,-77,-63,-55,-37, 30,39,41,47,48,76,96,-17,-13,-8,-1,7,9};
        int[] arr2 = {-83,-79,-77,-63,-55,-37,-17,-13,-8,-1,7,9,30,39,41,47,48,76,96};
//        directSort(arr);
//        quickSort(arr, 0, arr.length-1);
//        binarySearch(arr2, 96);
        heapSort(arr);
//        secondMinItem(arr);
    }

    public static void directSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
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
        int mid = arr[(start+end)/2];
        do{
            while (arr[left]<mid){
                left++;
            }
            while (arr[right]>mid){
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
        }while (left<=right);
        if(left<=end){quickSort(arr,left, end);}
        if(right>=start){quickSort(arr,start, right);}
        System.out.println(Arrays.toString(arr));
    }
    public static void binarySearch(int[] arr, int item){
       int left = 0;
       int right = arr.length-1;
       while (left<=right){
           int mid = (left+right)/2;
           if(arr[left]<item)left=mid+1;
           if(arr[right]>item)right=mid-1;
           if(arr[mid]==item){
               System.out.println(mid);
               return;
           }
       }
        System.out.println(-1);
    }
    private static void heapify(int[] arr, int i, int size){
       int left = i*2+1;
       int right = i*2+2;
       int large = i;
       if(left<size&&arr[left]>arr[large])large=left;
       if(right<size&&arr[right]>arr[large])large=right;
       if(large!=i){
           int tempo = arr[i];
           arr[i] = arr[large];
           arr[large] = tempo;
       }
    }
    public static void heapSort(int[] arr){
        for (int i = arr.length/2-1; i >=0; i--) {
            heapify(arr,i,arr.length);
        }
        for (int i = arr.length-1; i >= 0; i--) {
            int tempo = arr[i];
            arr[i] = arr[0];
            arr[0] = tempo;
            heapify(arr, 0,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void secondMinItem(int[] arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min1){
                min2 = min1;
                min1 = arr[i];
            }else if(arr[i]<min2 && arr[i]!=min1){
                min2 = arr[i];
            }
        }
        System.out.println(min1+"&&"+min2);
    }

}
