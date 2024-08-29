package bai_tap.ex04;

import java.util.Arrays;
import java.util.Scanner;

import static bai_tap.ex02.FindNum2DirectArr.inputNum;

public class BinarySearch {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int[] arr =getArr();

        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the number you want to search");
        int n = inputNum(sc);
        boolean check = isExist(n, arr, 0, arr.length-1);
        System.out.println(check? "Yes" : "No");
    }

    private static boolean isExist(int n, int[] arr, int start, int end) {

        if(start>end){
            return false;
        }
        int mid = (start+end)/2;
        if(arr[mid]==n){
            return true;
        }else if(arr[mid]<n){
            return isExist(n, arr, mid+1, end);
        }else {
            return isExist(n, arr, start, mid-1);
        }

    }

    private static int[] getArr(){
        int arr[] = new int[(int) (Math.random()*20)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return sortArr(arr);
    }

    private static int[] sortArr(int[] arr){
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

}
