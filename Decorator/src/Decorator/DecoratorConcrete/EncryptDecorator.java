package Decorator;

public class EncryptDecorator extends DataSourceDecorator{
    private String encryptData;
    public EncryptDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data){
        encryptData = encrypt(data);
        System.out.println("EncryptDecorator: WriteData -> " + encryptData);
        super.writeData(encryptData);
    }

    @Override
    public String readData(){
        System.out.println("EncryptDecorator: ReadData");
        return decrypt(super.readData());
    }



    private String encrypt(String data){
        return data+"#";
    }

    private String decrypt(String data){
        return data.replace("#","");
    }
}
