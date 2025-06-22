package org.example;

public class TurnACOffCommand implements ICommand{

    private AirConditioner airConditioner;

    public TurnACOffCommand(AirConditioner ac) {
        this.airConditioner = ac;
    }

    public void execute() {
        airConditioner.turnOffAC();
    }

    public void undo() {
        airConditioner.turnOnAC();
    }
}
