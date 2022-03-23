package Class.Sort;

import java.util.Arrays;

public class BubbleSort {

  // 冒泡排序
  // 1. 比較陣列中兩個相鄰的元素，如果第一個元素比第二個大就交換位置
  // 2. 每一次都會產生出一個最大跟一個最小的元素
  // 3. 下一輪就可以少一次排序
  // 4. 依序比較直到全部的元素比較完畢

  public static void main(String[] args) {
    int[] forCompare = {7, 33, 57, 2, 46, 12, 64, 8, 9};

    // 呼叫排序的方法
    int[] sortArray = sort(forCompare);
    System.out.println(Arrays.toString(sortArray));
  }

  public static int[] sort(int[] array) {
    // a. 暫存的變數
    int temp = 0;

    // b. 外層控制要執行多少次比較
    for (int i = 0; i < array.length - 1; i++) {

      // c-1. 透過flag來減少無意義的比較(因為有些已經比較過了)
      boolean flag = false;

      // d. 內層控制當比較兩個元素時，如果第一個數字比第二個數字大則交換，否則不動作
      for (int j = 0; j < array.length - 1 - i; j++) {

        // 此排序會由小到大
        if (array[j + 1] < array[j]) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          // c-2. 有進來比較的時候，flag才會等於true
          flag = true;
        }
      }

      // c-3. 若是無需比較，也就是flag不會被assign成true的時候，就結束
      if (flag == false) {
        break;
      }
    }
    return array;
  }
}
