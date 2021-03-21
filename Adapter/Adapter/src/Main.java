import Adapter.*;
import Client.*;

public class Main {
    public static void main(String[] args) {
        English englishTrans = new English(new VietnameseAdapter());
        englishTrans.say();

        English english = new English();
        english.say();



        Vietnamese vietnameseTrans = new Vietnamese(new EnglishAdapter());
        vietnameseTrans.say();

        Vietnamese vietnamese = new Vietnamese();
        vietnamese.say();

    }
}
