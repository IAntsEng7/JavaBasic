package ClassPractice.P76;
// 1. 建立Animal類別
public class Animal {
  // 2. 兩個成員變數(int age, float weight)
  public int age;
  public float weight;

  // 3. 一個成員方法用以列印(2.)的成員變數
  public void speak() {
    System.out.println(age);
    System.out.println(weight);
  }

  // (4. Animal建構子)
  public Animal(int ageX, float weightX) {
    this.age = ageX;
    this.weight = weightX;
  }

  public static void main(String[] args) {
    // 4. 藉由建構子產生一個Animal並同時初始化該物件的年紀與體重
    Animal dog = new Animal(5, 20.9f);
    // 5. 並呼叫speak()來得到此Animal的成員變數值
    dog.speak();
  }
}
