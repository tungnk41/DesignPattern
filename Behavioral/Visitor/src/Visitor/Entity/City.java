package Visitor.Entity;

import Visitor.Visitor;

public class City {

    public String cityInfo(){
        return "City Infomation";
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
