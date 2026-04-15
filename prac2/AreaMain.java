package prac2;

interface Area {
    double PI = 3.14;
    double getArea();
}

class Circle implements Area {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }
}

public class AreaMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Area of circle: " + c1.getArea());
    }
}

