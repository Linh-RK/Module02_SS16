package bai_tap.ex01;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearMax {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        System.out.println(getMax(arr));
    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    private static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
              max = arr[i];
            }
        }
        return max;
    }
}
