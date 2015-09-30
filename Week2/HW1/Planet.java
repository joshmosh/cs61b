public class Planet {
  public double x;
  public double y;
  public double xVelocity;
  public double yVelocity;
  public double mass;
  public String img;

  public Planet(double x, double y, double xVelocity, double yVelocity, double mass, String img) {
    this.x = x;
    this.y = y;
    this.xVelocity = xVelocity;
    this.yVelocity = yVelocity;
    this.mass = mass;
    this.img = img;
  }

  public double calcDistance(Planet p2) {
  }
}
