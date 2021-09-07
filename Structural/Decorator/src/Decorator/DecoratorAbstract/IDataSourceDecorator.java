package Decorator.DecoratorAbstract;

import Decorator.IDataSource;

public abstract class IDataSourceDecorator implements IDataSource {
    protected IDataSource wrappee;

     public IDataSourceDecorator(IDataSource dataSource) {
        this.wrappee = dataSource;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
