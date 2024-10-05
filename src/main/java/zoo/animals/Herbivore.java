package zoo.animals;

public abstract class Herbivore extends zoo.elements.Animal {

  public Herbivore(String name) {
    super(name);
  }
  @Override
  public void eat() {
    System.out.println(name + " ест траву");
  }
}
