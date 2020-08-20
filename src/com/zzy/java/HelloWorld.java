package com.zzy.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {

    private static final int ABCDE = 1;
    private int num;

    public static void main(String[] args) {
        System.out.println("hello world!!");
        ArrayList<String> list = new ArrayList<>();

    }

    public HelloWorld() {
    }

    private void method() {
        // this a line comment.
        // 中文
        createList();

        num = 0;

        try {
            FileInputStream fis = new FileInputStream("myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void createList() {
        List list1 = null;
        List list2 = null;
        Date date = new Date();
        list1.add(0, date);
    }
}
