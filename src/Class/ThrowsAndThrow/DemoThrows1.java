package Class.ThrowsAndThrow;

public class DemoThrows1 {

  String[] str = {"Hello1", "Hello2", "Hello3"};

  public void printStr(int i) throws Exception {
    System.out.println(str[i]);
  }

  public static void main(String[] args) {
    int i = 0;
    DemoThrows1 demoThrows1 = new DemoThrows1();
    while (i < 4) {
      try {
        demoThrows1.printStr(1);
      } catch (ArrayIndexOutOfBoundsException e1) {
        System.out.println("1. 已超出陣列長度");
      } catch (Exception e) {
        System.out.println("2. 就是Exception發生了");
      }
      i++;
    }
  }
}
