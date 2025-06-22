package org.example;

import java.util.Stack;

public class MyRemoteControl {
    Stack<ICommand> commandHistory = new Stack<ICommand>();
    ICommand command;
    MyRemoteControl() {}

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if(!commandHistory.isEmpty()) {
            ICommand command = commandHistory.pop();
            command.undo();
        }
    }
}
