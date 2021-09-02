package Memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    private Map<String,Memento> taker = new HashMap<>();

    public void  saveMemento(String state, Memento memento){
        taker.put(state,memento);
    }

    public Memento getMemento(String state){
        return taker.get(state);
    }

    public void clearSave(){
        taker.clear();
    }
}
