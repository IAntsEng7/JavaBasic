package ClassPractice.P85;

import ClassPractice.P76.Animal;

public class Elephant extends Animal {
  String name;

  public Elephant(int ageX, float weightX, String name) {
    super(ageX, weightX);
    this.name = name;
  }

  @Override
  public void speak() {
    super.speak();
    System.out.println("Animal Name is : " + name);
  }

  public static void main(String[] args) {
    Animal animal = new Animal(3, 8.7f);
    animal.speak();

    Elephant elephant = new Elephant(8, 1230.4f, "Elephant");
    elephant.speak();
  }
}
