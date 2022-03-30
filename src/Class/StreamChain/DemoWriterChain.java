package Class.StreamChain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DemoWriterChain {
  public static void main(String[] args) {
    try{
      FileWriter fileWriter = new FileWriter("/Users/iantseng/Desktop/DemoWriterChain.txt");
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      PrintWriter printWriter = new PrintWriter(bufferedWriter);

      // 1. 利用println()
      printWriter.println("Hello World!! 我把字寫進來DemoWriterChain的檔案中了。");
      // 2. 或是也可以利用write()
//      printWriter.write("Hello World!! 我把字寫進來DemoWriterChain的檔案中了。");

      printWriter.close();
      bufferedWriter.close();
      fileWriter.close();

    } catch (Exception e){
      System.err.println(e);
    }
  }
}
