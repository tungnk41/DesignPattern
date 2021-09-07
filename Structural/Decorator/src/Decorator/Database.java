package Decorator;

public class Database {
    private String data;

    public void writeData(String data){
        this.data = data;
    }

    public String readData(){
        return data;
    }
}
