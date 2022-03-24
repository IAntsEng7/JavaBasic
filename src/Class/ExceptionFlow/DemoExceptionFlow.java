package Class.ExceptionFlow;

public class DemoExceptionFlow {

  public static double compareMethod(int num1, int num2) {
    double result = num1 / num2;
    return result;
  }

  // Question
  // Q1. compareMethod()一切執行正常的輸出結果？
  // Q2. compareMethod()發生ArithmeticException的輸出結果？
  // Q3. compareMethod()發生"非"ArithmeticException或IllegalArgumentException的輸出結果？

  public static void main(String[] args) {
    DemoExceptionFlow demoExceptionFlow = new DemoExceptionFlow();
    try {
      System.out.println(demoExceptionFlow.compareMethod(24, 1));
      System.out.println("Output：0");
    } catch (ArithmeticException e1) {
      System.out.println("Output：1");
    } catch (IllegalArgumentException e2) {
      System.out.println("Output：2");
    } finally {
      System.out.println("Output：3");
    }
    System.out.println("Output：4");
  }

  // Answer
  // A1.
  //  24.0
  //  Output：0
  //  Output：3
  //  Output：4
  // 沒有例外情況需要處理

  // A2.
  //  Output：1
  //  Output：3
  //  Output：4
  // ArithmeticException已經catch，所以執行該catch區塊進行例外處理。

  // A3.
  //  Output：3
  // finally{System.out.println("Output：3");}，此程式區塊是必定會執行，所以三個輸出結果都會有。
  // System.out.println("Output：4");，沒有執行是因為例外尚未被處理。

}
