package com.designpatterns.day03.templatemethod;

public final class TemplateMethodDemo {
    private TemplateMethodDemo() {}
    public static void main(String[] args) { run(); }
    public static void run() {
        System.out.println("--- Template Method ---");
        DataMiner csv = new CsvDataMiner();
        System.out.println("  " + csv.mine("sales.csv"));
        DataMiner json = new JsonDataMiner();
        System.out.println("  " + json.mine("users.json"));
    }
}
