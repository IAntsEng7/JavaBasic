package Class.ThrowsAndThrow;

public class DemoThrow3 {
  public static double method(double i, double j) throws ArithmeticException {
    double result;
    if (j == 0) {
      throw new ArithmeticException("分母不可為0");
    }
    result = i / j;
    return result;
  }

  public static void main(String[] args) {
    try{
      System.out.println(method(3.33,0));
    } catch (ArithmeticException e){
      System.out.println(e.getMessage());
    }
  }
}
