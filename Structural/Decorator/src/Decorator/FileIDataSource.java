package Decorator;

public class FileIDataSource implements IDataSource {
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
