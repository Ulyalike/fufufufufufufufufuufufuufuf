package zoo.animals;
import zoo.doing.Terrestrial;
public class Tiger extends Carnivore {
  public Tiger(String name) {
    super(name);
  }

  @Override
  public void eat() {
    System.out.println(name + " ест говядину");
  }
}
