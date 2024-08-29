package bai_tap.ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindNum2DirectArr {
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        int[][] arr =getArr();
        System.out.println("My array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Find number in array");

        if(findNum(sc, arr)){
            System.out.println("Array contain number");
            System.out.println(map);
        }else
            System.out.println("Array does not contain number");
    }
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
    public static boolean findNum(Scanner sc, int[][] arr) {
        int number = inputNum(sc);

        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == number){
                    map.put(i,j);
                    check = true;
                }
            }
        }
        return check;
    }
    public static int inputNum(Scanner sc) {
        do{
            System.out.println("Enter the number you want to find:");
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
}
