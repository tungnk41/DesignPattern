package FlyWeight;

public class TreeType{
    private String name;
    private String color;
    private String canvas;

    public TreeType(String name, String color, String canvas) {
        this.name = name;
        this.color = color;
        this.canvas = canvas;
    }

    public void draw(int x, int y){
        System.out.println("Graphic drawing tree at x: " + x + " , y: " + y + " , name: " + name + " , color: " + color + ", canvas: " + canvas );
        getInfo();
    }

    public void getInfo(){
        System.out.println("TreeType Info : " + this);
    }
}