package com._520.prototype.v4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;
import java.util.Arrays;

@ToString
@Getter
@Setter
public class Sheep implements Cloneable, Serializable {

    private String name;
    private Integer age;

    public Dog friend;

    public Sheep(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     *  1.重写 clone 方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 对当前对象 clone
        Sheep sheep = (Sheep) super.clone();
        // 当前对象中的引用 clone
        sheep.friend = (Dog) friend.clone();

        return sheep;
    }

    /**
     *  将对象先序列化，在反序列化
     */
    public Object deepClone(){
        Sheep obj = null;

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化之前的字节数组
            System.out.println(Arrays.toString(bos.toByteArray()));

            // 反序列化
            ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            obj = (Sheep)ois.readObject();

            // 反序列化之后的字节数组，变长
            oos.writeObject(obj);
            System.out.println(Arrays.toString(bos.toByteArray()));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

            try {
                bos.close();
                oos.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return obj;
    }
}
