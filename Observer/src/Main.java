public class Main {
    public static void main(String[] args) {
        Signal signal = new Signal();
        Slot slot_1 = new Slot(1);
        Slot slot_2 = new Slot(2);

        signal.addObserver(slot_1);
        signal.addObserver(slot_2);

        signal.setData("phrase 1");
        signal.notifyDataChanged();

        signal.removeObserver(slot_1);

        signal.setData("phrase 2");
        signal.notifyDataChanged();

    }
}
