package org.example;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl remoteControl = new MyRemoteControl();

        remoteControl.setCommand(new TurnACOnCommand(airConditioner));
        remoteControl.pressButton();

        remoteControl.undo();
    }
}