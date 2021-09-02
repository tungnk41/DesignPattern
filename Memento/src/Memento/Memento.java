package Memento;

public class Memento {
    private double x;
    private double y;

    public Memento(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
