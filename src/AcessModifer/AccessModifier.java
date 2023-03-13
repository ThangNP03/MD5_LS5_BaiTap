package AcessModifer;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red" ;
    public AccessModifier (double radius){
        this.radius = radius;
    }
    public AccessModifier(){};

    public double getRadius() {
        return radius;
    }
    public  void  getArea() {
        System.out.println("Area is : " + (int)(Math.pow(radius,2) * Math.PI));
    }
}
