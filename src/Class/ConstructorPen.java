package Class;

public class ConstructorPen {
  public String brand;
  public double price;

  public ConstructorPen(String brandX, double priceX) {
    brand = brandX;
    price = priceX;
  }

  public static void main(String[] args) {
    ConstructorPen p = new ConstructorPen("uniball", 29.99);
    System.out.println(p.brand);
    System.out.println(p.price);
  }
}
