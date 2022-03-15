package HomeworkPractice.Practice04;

public class Practice04a {
  //		有個一維陣列如下:
  //		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
  //		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
  //		(提示:陣列,length屬性)
  public static void main(String[] args) {
    int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    int average = sum / array.length;
    System.out.println("所有元素的平均值：" + average);

    for (int j = 0; j < array.length; j++) {
      if (array[j] > average) {
        System.out.print(array[j] + "\t");
      }
    }
  }
}
