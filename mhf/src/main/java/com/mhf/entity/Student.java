package com.mhf.entity;

import lombok.Data;

@Data
public class Student {

    private String name;
    private String no;

    public static void main(String[] args) {
        // 添加注释
        Student student = new Student();
        student.setName("1");
        student.setNo("2");
    }
}