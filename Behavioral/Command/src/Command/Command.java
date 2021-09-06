package Command;

import Editor.Editor;

public abstract class Command {
    private String backup;
    protected Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup(){
        backup = editor.content;
    }

    public void undo(){
        editor.content = backup;
        System.out.println("Undo : " + editor.content);

    }

    public abstract boolean execute();
}
