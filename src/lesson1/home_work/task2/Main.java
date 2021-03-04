package lesson1.home_work.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    Integer[] arrayIntegers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    String[] arrayStrings = { "a", "b", "c", "d", "e", "f" };

    ArrayList<Integer> integerArrayList = changeArrayToArrayList(arrayIntegers);
    ArrayList<String> stringsArrayList = changeArrayToArrayList(arrayStrings);

    System.out.println(integerArrayList);
    System.out.println(stringsArrayList);

  }

  public static <T> ArrayList<T> changeArrayToArrayList(T[] array) {
    ArrayList<T> arrayList = new ArrayList<>();
    Collections.addAll(arrayList, array);
    return arrayList;
  }
}
