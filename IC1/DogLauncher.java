public class DogLauncher {
  public static void main(String[] args) {
    Dog maya = new Dog(100);
    Dog yapster = new Dog(5);

    maya.makeNoise();

    Dog.maxDog(maya, yapster).makeNoise();
  }
}
