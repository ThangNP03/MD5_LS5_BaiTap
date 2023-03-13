package AcessModifer;

public class Main {
    public static void main(String[] args) {
        AccessModifier testCircle = new AccessModifier(5);
        System.out.println(testCircle.getRadius());
        testCircle.getArea();
    }
}
