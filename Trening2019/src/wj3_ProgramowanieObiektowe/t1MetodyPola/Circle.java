package wj3_ProgramowanieObiektowe.t1MetodyPola;

public class Circle {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
