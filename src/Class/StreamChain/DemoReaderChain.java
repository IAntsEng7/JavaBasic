package Class.StreamChain;

import java.io.BufferedReader;
import java.io.FileReader;

public class DemoReaderChain {
  public static void main(String[] args) {
    int read;
    String readline;
    try {
      FileReader fileReader = new FileReader("/Users/iantseng/Desktop/DemoInputStream.txt");
      // 1. 利用read()判斷是否已經讀完檔案，回傳 -1 則代表已到檔案末端
      while ((read = fileReader.read()) != -1) {
        System.out.print((char) read);
      }

      // ------------------------------------------------------------------
      // 2. 利用readline()判斷是否還有下一行，讀完會是 null 空值。
//      BufferedReader bufferedReader = new BufferedReader(fileReader);
//      while ((readline = bufferedReader.readLine()) != null){
//        System.out.println(readline);
//      }
//      bufferedReader.close();
      // ------------------------------------------------------------------

      fileReader.close();

    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
