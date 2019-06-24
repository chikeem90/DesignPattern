package io.chikeem90.commandPattern.example;

public class AlarmOnCommand implements Command {
    private Alarm theAlarm;

    public AlarmOnCommand(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    @Override
    public void execute() {
        theAlarm.start();
    }
}
