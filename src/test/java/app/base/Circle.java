package app.base;

public class Circle extends Object{
    private double r;

    public Circle(Double r) {
        this.r = r;
    }

    public Double getR() {
        return r;
    }

    public boolean equals(Circle circle) {
        return this.r == circle.getR();
    }


    public static void main(String[] args) {
        Object c1 = new Circle(5.0);
        Object c2 = new Circle(5.0);

        System.out.println(c1.getClass());
        System.out.println(c1.equals(c2)); // false

    }
}
