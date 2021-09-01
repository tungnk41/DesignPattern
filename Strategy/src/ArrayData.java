public class ArrayData {
    private Strategy strategy;

    public ArrayData(Strategy strategy){
        this.strategy = strategy;
    }

    void execute(){
        strategy.operate();
    }
}
