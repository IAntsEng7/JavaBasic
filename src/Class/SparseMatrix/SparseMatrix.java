package Class.SparseMatrix;

import java.util.Arrays;

// 如果矩陣中多數元素沒有資料，稱為稀疏矩陣(sparse matrix)。
// 而稀疏矩陣會造成記憶體空間的浪費，必要時可設計稀疏矩陣的儲存方式，利用較少記憶體儲存完整的矩陣資訊。
public class SparseMatrix {
  // 需求：在一個11*11的五子棋盤中，可以有儲存後退出與接續上一盤的功能
  public static void main(String[] args) {
    // 1. 建立一個二維陣列，0：無棋子，1：黑棋，2：白棋
    int[][] checkerboardOriginal = new int[11][11];
    checkerboardOriginal[1][2] = 1;
    checkerboardOriginal[2][3] = 2;
    System.out.println("輸出原始陣列");

    for (int[] array1 : checkerboardOriginal) {
      for (int index1 : array1) {
        System.out.print(index1 + "\t");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("==============================");
    System.out.println();

    // 2. 使用稀疏陣列Sparse Matrix儲存
    int[][] checkerboard = new int[11][11];
    checkerboard[1][2] = 1;
    checkerboard[2][3] = 2;
    System.out.println("稀疏陣列Sparse Matrix");

    // 2-a. 先取得有效值的數量
    int sum = 0;
    for (int[] array1 : checkerboard) {
      for (int index2 : array1) {
        if (index2 != 0) {
          sum++;
        }
      }
    }
    System.out.println("有效值的數量：" + sum);
    // 2-b. 建立一個稀疏陣列Sparse Matrix，以及記錄存放的數字數量count。
    int[][] checkerboardMatrix = new int[sum + 1][3];
    checkerboardMatrix[0][0] = 11;
    checkerboardMatrix[0][1] = 11;
    checkerboardMatrix[0][2] = sum;
    int count = 0;

    // 2-c. 遍歷checkerboard，將非0的元素存放到稀疏陣列Sparse Matrix
    for (int i = 0; i < checkerboard.length; i++) {
      for (int j = 0; j < checkerboard[i].length; j++) {
        // 當該位置不等於0的時候，記錄到checkerboardMatrix
        if (checkerboard[i][j] != 0) {
          count++;
          checkerboardMatrix[count][0] = i;
          checkerboardMatrix[count][1] = j;
          checkerboardMatrix[count][2] = checkerboard[i][j];
        }
      }
    }
    // 輸出稀疏陣列Sparse Matrix
    System.out.println("輸出稀疏陣列Sparse Matrix");
    for (int i = 0; i < checkerboardMatrix.length; i++) {
      System.out.println(
          checkerboardMatrix[i][0]
              + "\t"
              + checkerboardMatrix[i][1]
              + "\t"
              + checkerboardMatrix[i][2]);
    }
    System.out.println("========== 還原稀疏陣列Sparse Matrix(讀取原本的棋盤) ==========");
    // 3.a 建立還原的陣列
    int[][] returnMatrix = new int[checkerboardMatrix[0][0]][checkerboardMatrix[0][1]];

    // 3.b 還原該元素的值，i從1開始是因為：第0行是稀疏陣列Sparse Matrix統計的行列與有效數值無需讀取。
    for (int i = 1; i < checkerboardMatrix.length; i++) {
      returnMatrix[checkerboardMatrix[i][0]][checkerboardMatrix[i][1]] = checkerboardMatrix[i][2];
    }

    System.out.println("輸出還原稀疏陣列Sparse Matrix陣列");
    for (int[] arrayReturn : returnMatrix) {
      for (int index3 : arrayReturn) {
        System.out.print(index3 + "\t");
      }
      System.out.println();
    }
  }
}
