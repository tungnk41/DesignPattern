package Decorator.DecoratorConcrete;

import Decorator.IDataSource;
import Decorator.DecoratorAbstract.IDataSourceDecorator;

public class EncryptDecorator extends IDataSourceDecorator {
    public EncryptDecorator(IDataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data){
        System.out.println("EncryptDecorator: WriteData -> " + encrypt(data));
        super.writeData(encrypt(data));
    }

    @Override
    public String readData(){
        System.out.println("EncryptDecorator: ReadData");
        return decrypt(super.readData());
    }



    private String encrypt(String data){
        return data+"#Encrypted";
    }

    private String decrypt(String data){
        return data.replace("#Encrypted","");
    }
}
