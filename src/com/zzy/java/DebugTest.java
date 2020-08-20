package com.zzy.java;

import java.util.HashMap;

/**
 * This is a debug test
 */
public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "20");
        map.put("school", "Tsinghua");
        map.put("major", "Computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
