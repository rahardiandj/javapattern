package com.juliart.sharding;

public class Data {

    private int key;

    private String value;

    private DataType type;

    public int getKey(){
        return key;
    }

    public String getValue() {
        return value;
    }

    public DataType getType() {
        return type;
    }
}

enum DataType {
    TYPE_1, TYPE_2, TYPE_3
}
