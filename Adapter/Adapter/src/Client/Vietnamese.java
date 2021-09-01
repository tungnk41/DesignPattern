package Client;

import Adapter.TranslatorAdapter;


public class Vietnamese {
    TranslatorAdapter translatorAdapter;

    public Vietnamese(){

    }

    public Vietnamese(TranslatorAdapter translatorAdapter){
        this.translatorAdapter = translatorAdapter;
    }


    public void say(){
        if(translatorAdapter != null){
            translatorAdapter.say();
        }else{
            System.out.println("Xin chao");
        }

    }

}
