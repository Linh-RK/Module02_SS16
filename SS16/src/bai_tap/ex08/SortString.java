package bai_tap.ex08;

import java.util.*;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String[] arr = str.split("");

        List<String> subStringArr = new ArrayList<>();
        String sub="";
        for (int i = 0; i < arr.length; i++) {
             sub = arr[i];
                for (int j = i; j < arr.length-1; j++) {
                    if (arr[j].compareTo(arr[j+1]) < 0) {
                         sub = sub.concat(arr[j+1]);
                    }else
                        break;
                }
                subStringArr.add(sub);
        }
        System.out.println(subStringArr);

       Integer lengthMax= subStringArr.stream().map(String::length).max(Integer::compareTo).get();
        System.out.println(lengthMax);
        System.out.println("Substring has max length: " );
      List<String> result = subStringArr.stream().filter(s-> {
          if(s.length() == lengthMax)
              return true;
          else {
              return false;
          }
      }).toList();
        System.out.println(result);
    }
}
