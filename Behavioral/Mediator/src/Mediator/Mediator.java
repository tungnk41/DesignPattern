package Mediator;

import java.util.HashMap;
import java.util.Map;

public class Mediator {
    private Map<Integer, User> mapUser = new HashMap();

    public void registerUser(User user){
        if(!mapUser.containsKey(user.id)){
            mapUser.put(user.id,user);
        }
    }

    public void unRegisterUser(User user){
        if(mapUser.containsKey(user.id)){
            mapUser.remove(user.id);
        }
    }

    public void sendToAll(User sender,String msg){
        String message = "Send from User " + sender.id + " : " + msg;
        for (Map.Entry<Integer,User> entryUser : mapUser.entrySet()) {
            if(entryUser.getKey() != sender.id){
                entryUser.getValue().reciveMessage(message);
            }
        }
    }

    public void sendToUser(User sender, Integer idReceiver, String msg){
        String message = "Send from User " + sender.id + " : " + msg;
        if(mapUser.containsKey(idReceiver)){
            mapUser.get(idReceiver).reciveMessage(message);
        }
    }

}
