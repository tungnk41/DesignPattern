package Adapter;

import Client.English;

public class EnglishAdapter implements TranslatorAdapter{
    private English english;

    public EnglishAdapter(){
        english = new English();
    }

    @Override
    public void say() {
        english.say();
    }
}
