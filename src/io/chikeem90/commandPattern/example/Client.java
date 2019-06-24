package io.chikeem90.commandPattern.example;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);
        LampOffCommand lampOffCommand = new LampOffCommand(lamp);
        Button button1 = new Button(lampOnCommand);
        button1.pressed();
        button1.setCommand(lampOffCommand);
        button1.pressed();
    }
}
