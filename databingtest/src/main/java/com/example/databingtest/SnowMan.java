package com.example.databingtest;

public class SnowMan {
    private String name;
    private String level;

    public SnowMan(String name, String level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "SnowMan{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
