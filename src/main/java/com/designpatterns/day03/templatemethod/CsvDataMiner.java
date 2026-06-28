package com.designpatterns.day03.templatemethod;

public class CsvDataMiner extends DataMiner {
    @Override protected String openConnection(String source) { return "CSV:" + source; }
    @Override protected String parse(String raw) { return raw.replace("CSV:", "rows="); }
    @Override protected String analyze(String data) { return "CSV analysis → " + data; }
}
