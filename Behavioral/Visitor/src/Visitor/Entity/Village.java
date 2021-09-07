package Visitor.Entity;

import Visitor.Visitor;

public class Village {

    public String villageInfo(){
        return "Village Infomation";
    }


    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
