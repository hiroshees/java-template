package chapter02;

public class GoogleStyleTest {
  public static void main(String[] args) {
    int targetNumber = 10;
    if (targetNumber > 5) {
      System.out.println("数字は5より大きいです");
      System.out.println("Googleスタイルならここがスペース2つになります");
    } else {
      System.out.println("5以下です");
    }
  }

  public static int add(int a, int b) {
    return a + b;
  }
}
