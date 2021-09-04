package Decorator;

import javax.xml.crypto.Data;

public class FileDataSource implements DataSource{
    private Database database = new Database();

    @Override
    public void writeData(String data) {
        System.out.println("FileDataSource: WriteData -> " + data);
        database.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("FileDataSource: ReadData");
        return database.readData();
    }
}
