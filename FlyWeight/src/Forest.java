import FlyWeight.Tree;
import FlyWeight.TreeType;
import FlyWeight.TreeTypeFactory;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> forest = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String canvas){
        Tree tree = new Tree(x,y,TreeTypeFactory.provideTreeType(name,color,canvas));
        forest.add(tree);
    }

    public void draw(){
        for (Tree tree: forest) {
            tree.draw();
        }
    }

}
