import Command.CopyCommand;
import Command.PasteCommand;
import Editor.Editor;

public class Main {
    public static void main(String[] args) {
        Editor application = new Editor();
        Editor editor = new Editor();

        application.executeCommand(new CopyCommand(editor));
        application.executeCommand(new PasteCommand(editor));
        application.undo();

    }
}
