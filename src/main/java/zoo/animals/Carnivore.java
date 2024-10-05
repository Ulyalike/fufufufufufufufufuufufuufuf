package zoo.animals;

public abstract class Carnivore extends zoo.elements.Animal {
  public Carnivore(String name) {
    super(name);
  }

  public abstract void eat();
}
