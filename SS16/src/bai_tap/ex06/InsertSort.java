package bai_tap.ex06;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr= getArr();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
        }
        return arr;
    }
}
