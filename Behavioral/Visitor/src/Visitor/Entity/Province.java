package Visitor.Entity;

import Visitor.Visitor;

public class Province {

    public String provinceInfo(){
        return "Province Infomation";
    }


    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
