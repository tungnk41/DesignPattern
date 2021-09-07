import Decorator.DecoratorAbstract.IDataSourceDecorator;
import Decorator.DecoratorConcrete.CompressDecorator;
import Decorator.IDataSource;
import Decorator.DecoratorConcrete.EncryptDecorator;
import Decorator.FileIDataSource;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {

        IDataSourceDecorator encode = new CompressDecorator(
                                            new EncryptDecorator(
                                                    new FileIDataSource()));

        encode.writeData("abc");

        String data = encode.readData();

        System.out.println(data);
    }
}
