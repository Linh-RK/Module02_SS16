package bai_tap.ex13;

import bai_tap.ex14.Student;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr()    ;
        System.out.println(Arrays.toString(arr));

        System.out.println("bubbleSort"+ Arrays.toString(bubbleSort(arr)));
        System.out.println("selectionSort"+ Arrays.toString(selectionSort(arr)));
        System.out.println("insertionSort"+ Arrays.toString(insertionSort(arr)));
    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    private static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    private static int[] selectionSort(int[] arr){
        int min;
        for (int  i = 0; i < arr.length - 1; i++){
            min = arr[i];
            for(int j = i + 1; j < arr.length; j++)
                if (arr[j] < min)
                    min = arr[j];
            if (min != arr[i]){
                int temp = arr[i];
                arr[i] = min;
                min=arr[i];
            }
        }
       return arr;
    }
    public static int[] insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        return array;
    }
}
