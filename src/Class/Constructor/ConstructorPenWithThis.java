package Class.Constructor;

public class ConstructorPenWithThis {
  // 實體變數
  public String brand;
  public double price;
  public String inkColor;
  public int inkCapacity;

  public ConstructorPenWithThis(String brandX, double priceX) {
    // 區域變數
    this.brand = brandX;
    this.price = priceX;
    // this => new ConstructorPenWithThis()
  }

  public ConstructorPenWithThis(String brandXX, String inkColorXX, int inkCapacityXX) {
    // 一個類別可以有多個建構子，建構子可以overloading
    this.brand = brandXX;
    this.inkColor = inkColorXX;
    this.inkCapacity = inkCapacityXX;
  }

  public static void main(String[] args) {
    ConstructorPenWithThis p1 = new ConstructorPenWithThis("muji", 24.99);
    System.out.println(p1.brand);
    System.out.println(p1.price);

    ConstructorPenWithThis p2 = new ConstructorPenWithThis("uniball","blue", 3);
    System.out.println(p2.brand);
    System.out.println(p2.inkColor);
    System.out.println(p2.inkCapacity + "ml");
  }
}
