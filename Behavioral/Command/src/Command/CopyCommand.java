package Command;

import Editor.Editor;

public class CopyCommand extends Command{

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        System.out.println("CopyCommand executed");
        editor.clipboard = "#Data";
        return true;
    }
}
