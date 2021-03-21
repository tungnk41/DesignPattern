public class Master {

    private Adapter adapter;
    public Master(){

    }

    public Master(Adapter adapter){
        this.adapter = adapter;
    }

    public void rotate(){
        System.out.println("Master rotated");
        adapter.rotate();
    }
}
