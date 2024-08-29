package bai_tap.ex11;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<FootballTeam> footballTeams= new ArrayList<>();

        footballTeams.add(new FootballTeam(1,"team 1",20,50));
        footballTeams.add(new FootballTeam(2,"team 2",22,10));
        footballTeams.add(new FootballTeam(3,"team 3",21,40));
        footballTeams.add(new FootballTeam(4,"team 4",15,15));
        System.out.println("bubbleSort ");
        bubbleSort(footballTeams);
        System.out.println("selectionSort");
        selectionSort(footballTeams);
        System.out.println("insertSort ");
        insertSort(footballTeams);
    }
    public static void bubbleSort(List<FootballTeam> footballTeams){
        for (int i = 0; i < footballTeams.size()-1; i++) {
            for (int j = i+1; j < footballTeams.size(); j++) {
                if (footballTeams.get(i).getScore() < footballTeams.get(j).getScore()) {
                    FootballTeam temp = footballTeams.get(i);
                    footballTeams.set(i, footballTeams.get(j));
                    footballTeams.set(j, temp);
                }
            }
        }
        footballTeams.forEach(System.out::println);
    }
        public static void selectionSort(List<FootballTeam> footballTeams){
            int pos;
            FootballTeam temp;
            for(int i = 1; i < footballTeams.size(); i++){ //đoạn array[0] đã sắp xếp
                temp = footballTeams.get(i);
                pos = i;

                while(pos > 0 && temp.getScore() > footballTeams.get(pos-1).getScore()){
                    footballTeams.set(pos, footballTeams.get(pos - 1)); // đổi chỗ
                    pos--;
                }
                footballTeams.set(pos, temp);
            }
            footballTeams.forEach(System.out::println);
    }
    public static void insertSort(List<FootballTeam> footballTeams){

        for (int i = 1; i < footballTeams.size(); i++) {
            for (int j = i; j > 0 ; j--) {
                if (footballTeams.get(j).getScore() > footballTeams.get(j - 1).getScore()) {
                    FootballTeam temp = footballTeams.get(j);
                    footballTeams.set(j, footballTeams.get(j - 1));
                    footballTeams.set(j - 1, temp);
                }
            }
        }
        footballTeams.forEach(System.out::println);
    }
}
