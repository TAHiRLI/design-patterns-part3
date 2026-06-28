package com.designpatterns.day03.templatemethod;

public abstract class DataMiner {
    public final String mine(String source) {
        String raw = openConnection(source);
        String parsed = parse(raw);
        closeConnection();
        return analyze(parsed);
    }
    protected abstract String openConnection(String source);
    protected abstract String parse(String raw);
    protected void closeConnection() { System.out.println("  Connection closed"); }
    protected abstract String analyze(String data);
}
