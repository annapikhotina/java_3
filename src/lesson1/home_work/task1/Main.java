package lesson1.home_work.task1;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Integer[] arrayIntegers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    String[] arrayStrings = { "a", "b", "c", "d", "e", "f" };

    Integer[] arrayIntegersSwap = swapArrayElements(arrayIntegers, 3, 7);
    String[] arrayStringsSwap = swapArrayElements(arrayStrings, 5, 0);

    System.out.println(Arrays.toString(arrayIntegersSwap));
    System.out.println(Arrays.toString(arrayStringsSwap));

  }

  public static <T> T[] swapArrayElements(T[] array, int x, int y) {
    if (x > array.length - 1 || x < 0 || y > array.length - 1 || y < 0) {
      System.out.println("Attempt to swap element out of array boundary. The array has not been modified.");
    } else {
      T temp = array[x];
      array[x] = array[y];
      array[y] = temp;
      return array;
    }
    return array;
  }
}
