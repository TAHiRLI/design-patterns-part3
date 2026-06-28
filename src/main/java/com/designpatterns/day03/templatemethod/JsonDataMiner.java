package com.designpatterns.day03.templatemethod;

public class JsonDataMiner extends DataMiner {
    @Override protected String openConnection(String source) { return "JSON:" + source; }
    @Override protected String parse(String raw) { return raw.replace("JSON:", "objects="); }
    @Override protected String analyze(String data) { return "JSON analysis → " + data; }
}
