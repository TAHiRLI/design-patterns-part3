package com.designpatterns.day03.command;

public final class CommandDemo {
    private CommandDemo() {
    }

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("--- Command ---");
        Light light = new Light();
        RemoteControl remote = new RemoteControl();
        remote.press(new LightOnCommand(light));
        System.out.println("  Light is on: " + light.isOn());
        remote.undo();
        System.out.println("  After undo, light is on: " + light.isOn());
        remote.press(new LightOffCommand(light));
        System.out.println("  Light is on: " + light.isOn());
    }
}
