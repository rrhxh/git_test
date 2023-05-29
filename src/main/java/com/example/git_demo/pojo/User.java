package com.example.git_demo.pojo;

/**
 * @author 张然~
 * version  1.0
 */
public class User {
    String name;
    int age;

    public  User(){

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
