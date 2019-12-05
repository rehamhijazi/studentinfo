package com.example.studentinfo;


public class Note {

    String id;
    String name;
    String level;
    Float avg;


    public Note(String id, String name, String level, Float avg) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Float getAvg() {
        return avg;
    }

    public void setAvg(Float avg) {
        this.avg = avg;
    }
}
