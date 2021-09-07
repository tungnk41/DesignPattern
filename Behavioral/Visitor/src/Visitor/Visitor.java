package Visitor;

import Visitor.Entity.City;
import Visitor.Entity.Province;
import Visitor.Entity.Village;

public interface Visitor {
    void visit(City city);
    void visit(Province province);
    void visit(Village village);

}
