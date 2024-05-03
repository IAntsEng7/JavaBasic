package ClassPractice.P85;

import ClassPractice.P76.Animal0503;

public class Elephant0503 extends Animal0503 {
  private final String name;

  public Elephant0503(int ageX, float weightX, String name) {
    super(ageX, weightX);
    this.name = name;
  }

  @Override
  public void speak() {
    super.speak();
    System.out.println("Animal Name is : " + name);
  }

  public static void main(String[] args) {
    Animal0503 animal0503 = new Animal0503(4, 5.6f);
    animal0503.speak();

    Elephant0503 elephant0503 = new Elephant0503(5,67.89f,"Elephant0503");
    elephant0503.speak();
  }
}
