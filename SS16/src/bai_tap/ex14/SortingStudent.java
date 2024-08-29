package bai_tap.ex14;

import bai_tap.ex10.FootballTeam;

import java.util.ArrayList;
import java.util.List;

public class SortingStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Linh",93));
        students.add(new Student(2,"Huong",95));
        students.add(new Student(3,"Hung",91));
        students.add(new Student(4,"Ngoc",96));
        System.out.println("bubbleSort");
        bubbleSort(students);
        System.out.println("selectionSort");
        selectionSort(students);
        System.out.println("insertSort");
        insertSort(students);
    }
    public static void bubbleSort(List<Student> students){
        for (int i = 0; i < students.size()-1; i++) {
            for (int j = i+1; j < students.size(); j++) {
                if (students.get(i).getScore() > students.get(j).getScore()) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        students.forEach(System.out::println);
    }
    public static void selectionSort(List<Student> students){
        int pos;
        Student temp;
        for(int i = 1; i < students.size(); i++){ //đoạn array[0] đã sắp xếp
            temp = students.get(i);
            pos = i;

            while(pos > 0 && temp.getScore() < students.get(pos-1).getScore()){
                students.set(pos, students.get(pos - 1)); // đổi chỗ
                pos--;
            }
            students.set(pos, temp);
        }
        students.forEach(System.out::println);
    }
    public static void insertSort(List<Student> students){

        for (int i = 1; i < students.size(); i++) {
            for (int j = i; j > 0 ; j--) {
                if (students.get(j).getScore() < students.get(j - 1).getScore()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j - 1));
                    students.set(j - 1, temp);
                }
            }
        }
        students.forEach(System.out::println);
    }
}
