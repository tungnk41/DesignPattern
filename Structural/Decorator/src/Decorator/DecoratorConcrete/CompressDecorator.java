package Decorator.DecoratorConcrete;

import Decorator.IDataSource;
import Decorator.DecoratorAbstract.IDataSourceDecorator;

public class CompressDecorator extends IDataSourceDecorator {
    public CompressDecorator(IDataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("CompressDecorator: WriteData -> " + compressData(data));
        super.writeData(compressData(data));
    }

    @Override
    public String readData() {
        System.out.println("CompressDecorator: ReadData");
        return depressData(super.readData());
    }




    private String compressData(String data){
        return data + "#Compressed";
    }

    private String depressData(String data){
        return data.replace("#Compressed", "");
    }
}
