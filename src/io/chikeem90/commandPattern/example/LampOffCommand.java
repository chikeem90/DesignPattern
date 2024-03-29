package io.chikeem90.commandPattern.example;

public class LampOffCommand implements Command {
    private Lamp theLamp;

    public LampOffCommand(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    @Override
    public void execute() {
        theLamp.turnOff();
    }
}
