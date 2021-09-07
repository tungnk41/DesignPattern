import Mediator.*;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        User user_1 = new User(mediator,1);
        User user_2 = new User(mediator,2);
        User user_3 = new User(mediator,3);
        User user_4 = new User(mediator,4);

        mediator.registerUser(user_1);
        mediator.registerUser(user_2);
        mediator.registerUser(user_3);
        mediator.registerUser(user_4);

        user_1.sendToAll("Hello");
        user_1.sendToUser(2,"Hello 2");
    }
}
