public class FactoryPlan {
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }

        if(planType.equalsIgnoreCase("Commercial")){
            return new Commercial();
        }

        if(planType.equalsIgnoreCase("Domestic")){
            return new Domestic();
        }

        return null;
    }
}
