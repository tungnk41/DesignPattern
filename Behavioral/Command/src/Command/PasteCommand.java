package Command;

import Editor.Editor;

public class PasteCommand extends Command{

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        backup();
        editor.content += editor.clipboard;
        System.out.println("PasteCommand executed : " + editor.content);
        return true;
    }
}
