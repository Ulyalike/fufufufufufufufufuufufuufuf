package zoo.animals;

public class Horse extends Herbivore implements zoo.doing.Terrestrial {
  public Horse(String name) {
    super(name);
  }

  @Override
  public void walk() {
    System.out.println(name + " ходит");
  }
}
