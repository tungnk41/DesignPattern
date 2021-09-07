import java.util.ArrayList;
import java.util.List;

public class Signal implements Observable{
    private String data;

    private List<Observer> listObserver;

    public Signal(){
        listObserver = new ArrayList<>();
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void addObserver(Observer observer) {
        listObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listObserver.remove(observer);
    }

    @Override
    public void notifyDataChanged() {
        for(Observer observer : listObserver){
            observer.updateDataChanged(this.data);
        }
    }
}
