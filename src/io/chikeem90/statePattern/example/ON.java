package io.chikeem90.statePattern.example;

public class ON implements State {
    // 싱글턴 적용
    private static ON on = new ON();

    public static ON getInstance() {
        return on;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("취침등 On!");
        light.setState(SLEEPING.getInstance());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off!");
        light.setState(OFF.getInstance());
    }
}
