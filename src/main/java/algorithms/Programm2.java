package algorithms;

public class Programm2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayUtils arrayUtils = new ArrayUtils();
        SortUtils sortUtils = new SortUtils();
//        arrayUtils.printArray(arrayUtils.prepareArray());
//        sortUtils.directSort(arrayUtils.prepareArray());
//        int rez = sortUtils.binarySearch(arr, 2);
//        System.out.println(rez);
//        sortUtils.quickSort(arrayUtils.prepareArray());
        sortUtils.heapSort(arrayUtils.prepareArray());
    }

}
