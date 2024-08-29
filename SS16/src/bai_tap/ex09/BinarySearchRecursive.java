package bai_tap.ex09;

import java.util.Arrays;
import java.util.Scanner;



public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = inputNum(sc);
        int[] arr =getArr(size);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the number you want to search");
        int n = inputNum(sc);
        boolean check = isExist(n, arr, 0, arr.length-1);
        System.out.println(check? "Yes" : "No");
    }

    private static int inputNum(Scanner sc) {
        do{

            String num = sc.nextLine();
            if (num.isBlank()) {
                System.out.println("Data can't be empty");
            } else {
                try {
                    return Integer.parseInt(num);
                } catch (NumberFormatException e) {
                    System.out.println("Must be a number");
                }
            }
        }while (true);
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

    private static int[] getArr(int n){

        int arr[] = new int[n];
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
