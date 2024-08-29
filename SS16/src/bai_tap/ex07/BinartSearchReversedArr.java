package bai_tap.ex07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static bai_tap.ex02.FindNum2DirectArr.inputNum;

public class BinartSearchReversedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arrays = getArr();
        System.out.println(Arrays.toString(arrays));
        System.out.println("Input min");
        int min = inputNum(sc);
        System.out.println("Input max");
        int max;
        int countMin = 0;
        int countMax = 0;
        int minIndex = -1;
        int maxIndex = -1;
        do {
            max = inputNum(sc);
        } while (max <= min);
        int minArr = arrays[0];
        int maxArr = arrays[arrays.length - 1];
        for (int i = 1; i < arrays.length-1; i++) {
            if(arrays[i] < max) {
                maxArr = arrays[i];
                maxIndex = i;
                for (int j = 0; j < arrays.length; j++) {
                    if(maxArr == arrays[i]) {
                        countMax++;
                        break;
                    }
                }
                break;
            }
        }
        for (int i = arrays.length-1; i >0; i--) {
            if(arrays[i] > min) {
                minArr = arrays[i];
                minIndex = i;
                for (int j = 0; j < arrays.length; j++) {
                    if(minArr == arrays[i]) {
                        countMin++;
                        break;
                    }
                }
                break;
            }
        }
        System.out.println("Index closest min is "+minIndex);
        System.out.println("Closest min"+ minArr + " repeat " +countMin+" time !");
        System.out.println("Index closest max is "+maxIndex);
        System.out.println("Closest max "+maxArr + " repeat " +countMax+" time !");

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
