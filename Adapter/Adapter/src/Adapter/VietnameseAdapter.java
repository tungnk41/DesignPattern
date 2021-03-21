package Adapter;

import Client.Vietnamese;

public class VietnameseAdapter implements TranslatorAdapter{

    private Vietnamese vietnamese;

    public VietnameseAdapter(){
        vietnamese = new Vietnamese();
    }

    @Override
    public void say() {
        vietnamese.say();
    }
}
