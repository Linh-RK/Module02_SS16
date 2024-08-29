package bai_tap.ex12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static bai_tap.ex02.FindNum2DirectArr.inputNum;

public class FindNumBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        int num = inputNum(sc);
        System.out.println(findNumBinary(arr, num, 0, arr.length-1));;
    }
    public  static int findNumBinary(Integer[] arr, int num, int start, int end) {
        if(start>end){
            return -1;
        } else {
            int mid = (start + end) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] < num) {
                return findNumBinary(arr, num, mid + 1, end);
            } else {
                return findNumBinary(arr, num, start, mid - 1);
            }
        }
    }
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }
}
