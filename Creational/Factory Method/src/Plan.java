public abstract class Plan {
    protected double rate;
    public abstract void setRate();
    public double getRate(){
        return rate;
    }

    public void printBill(int units){
        System.out.println(rate*units);
    }
}
