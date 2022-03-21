package Class;

public class ConstructorPenOverloading {
  public String brand;
  public double price;

  public ConstructorPenOverloading(String brandX, double priceX) {
    this.brand = brandX;
    this.price = priceX;
  }

  public ConstructorPenOverloading(String brandXX){
    this(brandXX, 2.99);
  }

  public ConstructorPenOverloading(double priceXX){
    this("muji", priceXX);
  }

  public ConstructorPenOverloading(){
    this("uniball", 1.99);
  }

  public static void main(String[] args) {
    ConstructorPenOverloading p1 = new ConstructorPenOverloading("Hi-Tec-C");
    System.out.println(p1.brand);
    System.out.println(p1.price);
    ConstructorPenOverloading p2 = new ConstructorPenOverloading(4.99);
    System.out.println(p2.brand);
    System.out.println(p2.price);
  }
}
