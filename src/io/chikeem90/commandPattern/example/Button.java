package io.chikeem90.commandPattern.example;

public class Button {
    public Command theCommand;

    public Button(Command theCommand) {
        setCommand(theCommand);
    }

    public void setCommand(Command newCommand) {
        this.theCommand = newCommand;
    }

    public void pressed() {
        theCommand.execute();
    }
}
