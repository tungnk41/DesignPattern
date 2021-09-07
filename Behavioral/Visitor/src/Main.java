import Visitor.Entity.City;
import Visitor.Entity.Province;
import Visitor.Entity.Village;
import Visitor.ExportVisitor;

public class Main {
    public static void main(String[] args) {
        City city = new City();
        Province province = new Province();
        Village village = new Village();
        ExportVisitor exportVisitor = new ExportVisitor();

        city.accept(exportVisitor);
        province.accept(exportVisitor);
        village.accept(exportVisitor);
    }
}
