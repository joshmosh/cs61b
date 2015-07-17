public class Arrays {
  public static void main(String[] args) {
    int[] numbers = new int[3];

    int[] stuff = new int[]{4, 7, 10};

    numbers[0] = 4;
    numbers[1] = 7;
    numbers[2] = 10;

    System.out.println(numbers[1]);
    System.out.println(stuff[1]);
    System.out.println(numbers.length);
  }
}
