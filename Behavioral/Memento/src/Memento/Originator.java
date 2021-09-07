package Memento;

public class Originator {
    private double x;
    private double y;

    public Originator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Memento save(){
        return new Memento(x,y);
    }

    public void undo(Memento memento){
        x = memento.getX();
        y = memento.getY();
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Originator{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
