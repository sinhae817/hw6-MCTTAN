public class Cone{
  private double radius;
  private double height;
  
  public Cone(double r, double h){
    this.radius = r;
    this.height = h;
  }
  
  public double getVolume()
  {
    double n = 1.0/3;
    return (n*Math.PI*Math.pow(radius,2)*height);
  }
  public double getSurfaceArea()
  {
    return ((Math.PI*Math.pow(radius,2))+(Math.PI*radius*Math.sqrt(Math.pow(radius,2)+Math.pow(height,2))));
  }
}
