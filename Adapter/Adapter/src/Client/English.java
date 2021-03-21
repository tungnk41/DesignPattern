package Client;

import Adapter.TranslatorAdapter;

public class English {
    private TranslatorAdapter translatorAdapter;

    public English(){

    }

    public English(TranslatorAdapter translatorAdapter){
        this.translatorAdapter = translatorAdapter;
    }

    public void say(){
        if(translatorAdapter != null){
            translatorAdapter.say();
        }else{
            System.out.println("Hello");
        }
    }
}
