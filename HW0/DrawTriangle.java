public class DrawTriangle {
  public static void drawTriangle(int n) {
    int row = 0;
    int size = n;

    while (row < size) {
      int col = 0;

      while (col <= row) {
        System.out.print('*');

        col++;
      }

      System.out.println();

      row++;
    }
  }

  public static void main(String[] args) {
    drawTriangle(Integer.parseInt(args[0]));
  }
}
