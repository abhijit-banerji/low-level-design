package org.example;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR, "Error Message");
        logProcessor.log(LogProcessor.DEBUG, "Debug Message");
        logProcessor.log(LogProcessor.INFO, "Info Message");
    }
}