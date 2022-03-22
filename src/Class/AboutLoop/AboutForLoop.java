package Class.AboutLoop;

public class AboutForLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6};

    // for迴圈具備迴圈設計要素(初值、條件、判斷)，
    // 除對存取較有彈性之外，在執行效能上也會比forEach好些。
    System.out.println("傳統for迴圈");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    // forEach迴圈是可以簡化程式碼，但基本上適用在取得全部元素。
    // 無法針對數據中的某些部分進行取得，使用上的彈性較差。
    System.out.println("增強型for迴圈 -> forEach");
    for (int j : numbers) {
      System.out.println(j);
    }
  }
}
