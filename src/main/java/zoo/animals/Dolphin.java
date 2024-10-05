package zoo.animals;
import zoo.doing.Swimming;
import zoo.doing.Swimming;

public class Dolphin extends Carnivore implements Swimming {
  public Dolphin(String name) {
    super(name);
  }

  @Override
  public void eat() {
    System.out.println(name + " ест рыбу");
  }

  @Override
  public void swim() {
    System.out.println(name + " плывет");
  }
}
