package io.codelex.oop.exercise3;

public enum EngineType {
    V12("V12"),
    V8("V8"),
    V6("V6"),
    VR6("VR6"),
    R4("R4"),
    R3("R3"),
    R6("R6");

    private final String type;
    EngineType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "EngineType{" +
                "type='" + type + '\'' +
                '}';
    }

}



