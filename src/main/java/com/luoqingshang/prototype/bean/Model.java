package com.luoqingshang.prototype.bean;

import java.io.Serializable;

public class Model implements Cloneable, Serializable {

    public Model() {
    }

    public Model(String name, String type) {
        this.name = name;
        this.type = type;
    }

    private String name;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public Model clone() throws CloneNotSupportedException {
        return (Model)super.clone();
    }
}
