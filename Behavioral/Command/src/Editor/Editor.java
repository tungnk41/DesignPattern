package Editor;

import Command.Command;
import Command.CommandHistory;

/* Editor.Editor */
public class Editor {
    private CommandHistory history = new CommandHistory();
    public String clipboard = "";
    public String content = "init";

    public void executeCommand(Command command){
        if(command.execute()){
            history.push(command);
        }
    }

    public void undo(){
        if(history.isEmpty()) return;

        Command command = history.pop();
        command.undo();
    }
}
