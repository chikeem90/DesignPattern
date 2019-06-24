package io.chikeem90.commandPattern.example;

public class LampOnCommand implements Command {
    private Lamp theLamp;

    public LampOnCommand(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    @Override
    public void execute() {
        theLamp.turnOn();
    }
}
