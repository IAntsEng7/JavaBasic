package ClassPractice.P76;

public class Animal0503 {
  private final int age;
  private final float weight;

  public Animal0503(int ageX, float weightX) {
    this.age = ageX;
    this.weight = weightX;
  }

  public void speak() {
    System.out.println("Animal0503's age is " + age + " and weight is " + weight + " .");
  }

  public static void main(String[] args){
    Animal0503 dog = new Animal0503(10, 0.5f);
    dog.speak();
  }
}
