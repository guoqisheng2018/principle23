package com.luoqingshang.prototype.bean;

import java.io.*;

public class ModelThorough2 implements Cloneable, Serializable {

    public ModelThorough2() {
    }

    public ModelThorough2(String name, String type, Model model) {
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
        return "ModelThorough2{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", model=" + model +
                '}';
    }

    @Override
    public ModelThorough2 clone() throws CloneNotSupportedException {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (ModelThorough2) ois.readObject();
        } catch (Exception e) {
            return null;
        } finally { //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                // TODO: handle exception
                System.out.println(e2.getMessage());
            }
        }
    }
}