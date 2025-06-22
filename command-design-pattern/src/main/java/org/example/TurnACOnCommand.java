package org.example;

public class TurnACOnCommand implements ICommand{

    private AirConditioner ac;

    public TurnACOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.turnOnAC();
    }

    public void undo() {
        ac.turnOffAC();
    }
}
