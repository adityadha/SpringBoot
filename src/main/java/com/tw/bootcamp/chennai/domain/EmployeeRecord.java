package com.tw.bootcamp.chennai.domain;


public class EmployeeRecord {
    public String getName() {
        return name;
    }

    private final String name;

    public EmployeeRecord(String name) {
        this.name = name;
    }
}
