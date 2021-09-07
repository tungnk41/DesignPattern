public class Main {
    public static void main(String[] args) {
        FactoryPlan factoryPlan = new FactoryPlan();

        Plan plan_domestic = factoryPlan.getPlan("domestic");
        plan_domestic.printBill(2);

        Plan plan_commercial = factoryPlan.getPlan("commercial");
        plan_commercial.printBill(2);
    }
}
