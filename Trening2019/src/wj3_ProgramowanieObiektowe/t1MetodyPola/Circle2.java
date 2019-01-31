package wj3_ProgramowanieObiektowe.t1MetodyPola;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle2 {

    private int radius;

    public Circle2(int radius){
        this.radius = radius;
    }

    public double area(){
        return PI * pow(radius, 2);
    }

    public double circumference(){
        return 2 * PI * radius;
    }
}
