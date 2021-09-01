import Composite.*;

public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();
        Leaf leaf_1 = new Leaf("Leaf_1");
        Leaf leaf_2 = new Leaf("Leaf_2");
        composite.add(leaf_1);
        composite.add(leaf_2);

        composite.show();

        composite.remove(leaf_1);

        composite.show();

    }
}
