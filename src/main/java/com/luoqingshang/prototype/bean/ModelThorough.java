package com.luoqingshang.prototype.bean;

public class ModelThorough implements Cloneable{

    public ModelThorough() {
    }

    public ModelThorough(String name, String type, Model model) {
        this.name = name;
        this.type = type;
        this.model = model;
    }

    private String name;

    private String type;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    private Model model;

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
        return "ModelThorough{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", model=" + model +
                '}';
    }

    @Override
    public ModelThorough clone() throws CloneNotSupportedException {
        ModelThorough modelThorough=(ModelThorough)super.clone();
        modelThorough.setModel(model.clone());
        return modelThorough;
    }
}
