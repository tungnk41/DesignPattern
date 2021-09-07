import Memento.CareTaker;
import Memento.Memento;
import Memento.Originator;

public class Main {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Originator originator = new Originator(1.0,1.0);
        originator.print();
        taker.saveMemento("#1", originator.save());
        originator.setX(1000);
        originator.print();
        originator.undo(taker.getMemento("#1"));
        originator.print();

    }
}
