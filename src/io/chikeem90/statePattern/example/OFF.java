package io.chikeem90.statePattern.example;

public class OFF implements State {
    // 싱글턴 적용
    private static OFF off = new OFF();

    public static OFF getInstance() {
        return off;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On!");
        light.setState(ON.getInstance());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반응 없음");
    }
}
