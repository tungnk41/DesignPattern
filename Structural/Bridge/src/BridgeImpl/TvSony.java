package BridgeImpl;

import BridgeAbstract.TvIFace;

public class TvSony implements TvIFace {
    @Override
    public void turnOn() {
        System.out.println("TV Sony Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV Sony Turn Off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("TV Sony Change Channel To " + channel);
    }

    @Override
    public void showInfo() {
        System.out.println("This Is Sony TV");
    }
}
