import BridgeImpl.RemoteTv;
import BridgeImpl.TvSony;

public class Bridge {

    public static void main(String[] args) {
        TvSony tv = new TvSony();
        RemoteTv remote = new RemoteTv(tv);

        remote.turnOn();
        remote.setChannel(3);
        remote.showInfoTV();
        remote.turnOff();
    }
}
