package Class;

public class ConstructorPenOverloading {
  public String brand;
  public double price;

  public ConstructorPenOverloading(String brandX, double priceX) {
    this.brand = brandX;
    this.price = priceX;
  }

  // single argument
  public ConstructorPenOverloading(String brandXX){
    this(brandXX, 2.99);
  }

  // single argument
  public ConstructorPenOverloading(double priceXX){
    this("muji", priceXX);
  }

  // no argument
  public ConstructorPenOverloading(){
    this("uniball", 1.99);
  }

  // 建構子overloading設計，搭配this()讓物件屬性的初始值，更方便使用者在呼叫時的彈性
  public static void main(String[] args) {
    ConstructorPenOverloading p1 = new ConstructorPenOverloading("Hi-Tec-C");
    System.out.println(p1.brand);
    System.out.println(p1.price);
    ConstructorPenOverloading p2 = new ConstructorPenOverloading(4.99);
    System.out.println(p2.brand);
    System.out.println(p2.price);
  }
}
