package Visitor;

import Visitor.Entity.City;
import Visitor.Entity.Province;
import Visitor.Entity.Village;

public class ExportVisitor implements Visitor{


    @Override
    public void visit(City city) {
        System.out.println("Export city: " + city.cityInfo());
    }

    @Override
    public void visit(Province province) {
        System.out.println("Export province: " + province.provinceInfo());
    }

    @Override
    public void visit(Village village) {
        System.out.println("Export village: " + village.villageInfo());
    }
}
