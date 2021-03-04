package lesson1.home_work.task3;

import java.util.ArrayList;
import lesson1.home_work.task3.fruits.Fruit;

public class FruitBox<E extends Fruit> {

  private final ArrayList<E> fruits;

  public FruitBox() {
    this.fruits = new ArrayList<>();
  }

  public FruitBox(ArrayList<E> fruits) {
    this.fruits = fruits;
  }

  public ArrayList<E> getFruits() {
    return fruits;
  }

  public void addFruit(E fruit) {
    fruits.add(fruit);
  }

  public void removeFruit(E fruit) {
    fruits.remove(fruit);
  }

  public float getWeight() {
    float weight = 0.0f;

    for (E fruit : fruits) {
      weight += fruit.getWeight();
    }
    return weight;
  }

  public boolean compareWeight(FruitBox<?> box) {
    return Math.abs(this.getWeight() - box.getWeight()) < 0.1;
  }

  public void addAllFruits(FruitBox<E> box) {
    fruits.addAll(box.getFruits());
    box.getFruits().clear();
  }
}
