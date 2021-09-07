public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(0,0,"TreeA","Blue","TreeA.img");
        forest.plantTree(0,0,"TreeB","Red","TreeB.img");
        forest.plantTree(0,0,"TreeA","Blue","TreeA.img");
        forest.draw();
    }
}
