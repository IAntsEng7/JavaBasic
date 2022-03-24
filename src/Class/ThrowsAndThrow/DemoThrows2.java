package Class.ThrowsAndThrow;

public class DemoThrows2 {
  String[] str = {"Hello1", "Hello2", "Hello3"};

  public void printStr(int i) throws Exception {
    System.out.println(str[i]);
  }

  public static void main(String[] args) throws Exception {
    int i = 0;
    DemoThrows2 demoThrows2 = new DemoThrows2();
    while (i < 4) {
      demoThrows2.printStr(i);
      i++;
    }
  }
}
