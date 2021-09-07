package Mediator;

public class User {
    private Mediator mediator;
    public Integer id;

    public User(Mediator mediator, Integer id) {
        this.mediator = mediator;
        this.id = id;
    }

    public void reciveMessage(String msg){
        System.out.println("User : " + id + " receive : " + msg);
    }

    public void sendToAll(String msg){
        mediator.sendToAll(this,msg);
    }

    public void sendToUser(Integer idReceiver, String msg){
        mediator.sendToUser(this,idReceiver,msg);
    }
}
