public class DrawingATriangle {
  public static void main(String[] args) {
    int row = 0;
    int size = 5;

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
}
