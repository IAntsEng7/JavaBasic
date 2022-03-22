package Class.AboutLoop;

public class AboutWhileDoWhileLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6};
    int i = 0;

    // while(條件判斷){...敘述...}，有可能一次都沒有執行過。
    System.out.println("while迴圈");
    while (i < numbers.length) {
      System.out.println(numbers[i]);
      i++;
    }

    // do...while，必定執行一次後再根據while條件判斷是否繼續執行。
    System.out.println("do...while迴圈(必定執行一次)");
    int j = 0;
    do {
      System.out.println(numbers[j]);
      j++;
    } while (j < numbers.length);

    System.out.println("==================================================");
    System.out.println("=======以上是都會執行到，以下是有可能不會執行的狀況======");
    System.out.println("==================================================");

    System.out.println("while迴圈");
    int k = 10;
    while (i < numbers.length) {
      System.out.println(numbers[i]);
      i++;
    }
    System.out.println("此時因為while的條件判斷是false，所以整個while迴圈就不會執行了");

    int m = 10;
    do {
      System.out.println("do...while的進入點，必定執行一次。但...因為設定的值超出陣列的所以值範圍，所以會出現exception。");
      System.out.println(numbers[m]);
      // Exception in thread "main"
      // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
      m++;
    } while (m < numbers.length);
  }
}
