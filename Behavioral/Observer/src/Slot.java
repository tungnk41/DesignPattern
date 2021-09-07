public class Slot implements Observer{
    private int id;

    public Slot(int id){
        this.id = id;
    }

    @Override
    public void updateDataChanged(String data) {
        System.out.println("Slot: " + id + " , onDataChanged : " + data);
    }
}
