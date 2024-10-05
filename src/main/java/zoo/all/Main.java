package zoo.all;

import zoo.animals.*;

public class Main {
  public static void main(String[] args) {
    Horse horse = new Horse("Лошадь");
    horse.eat();
    horse.walk();

    Tiger tiger = new Tiger("Тигр");
    tiger.eat();

    Dolphin dolphin = new Dolphin("Дельфин");
    dolphin.eat();
    dolphin.swim();

    Eagle eagle = new Eagle("Орел");
    eagle.eat();
    eagle.fly();

    Camel camel = new Camel("Верблюд");
    camel.eat();
    camel.walk();
  }
}