package lesson1.home_work.task3;

import lesson1.home_work.task3.fruits.Apple;
import lesson1.home_work.task3.fruits.Orange;

public class Main {
  public static void main(String[] args) {
    FruitBox<Apple> appleBox = new FruitBox<>();
    appleBox.addFruit(new Apple(1.0f));
    appleBox.addFruit(new Apple(1.0f));
    appleBox.addFruit(new Apple(1.0f));
    appleBox.addFruit(new Apple(1.0f));
    appleBox.addFruit(new Apple(1.0f));
    appleBox.addFruit(new Apple(1.0f));

    System.out.println(appleBox.getWeight());

    FruitBox<Orange> orangeBox = new FruitBox<>();
    orangeBox.addFruit(new Orange(1.5f));
    orangeBox.addFruit(new Orange(1.5f));
    orangeBox.addFruit(new Orange(1.5f));
    orangeBox.addFruit(new Orange(1.5f));
    orangeBox.addFruit(new Orange(1.5f));
    orangeBox.addFruit(new Orange(1.5f));

    System.out.println(orangeBox.getWeight());

    FruitBox<Orange> orangeBox1 = new FruitBox<>();
    orangeBox1.addFruit(new Orange(1.5f));
    orangeBox1.addFruit(new Orange(1.5f));
    orangeBox1.addFruit(new Orange(1.5f));
    orangeBox1.addFruit(new Orange(1.5f));

    System.out.println(appleBox.compareWeight(orangeBox));
    System.out.println(appleBox.compareWeight(orangeBox1));

    orangeBox.addAllFruits(orangeBox1);
    System.out.println(orangeBox.getWeight());


  }
}
