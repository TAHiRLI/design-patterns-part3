package com.designpatterns.day03.command;

public class LightOnCommand implements Command {
    private final Light light;
    public LightOnCommand(Light light) { this.light = light; }
    @Override public void execute() { light.turnOn(); }
    @Override public void undo() { light.turnOff(); }
    @Override public String describe() { return "Light ON"; }
}
