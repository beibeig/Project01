package com.zzy.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TempleteTest {

    // 模板六：prsf
    private static final int NUM = 1;

    // 变形：psf
    public static final int NUM2 = 2;
    // 变形：psfi
    public static final int NUM3 = 3;
    // 变形：psfs
    public static final String NATION = "China";

    // 模板一：main
    public static void main(String[] args) {

        // 模板二：sout
        System.out.println("hello!!");
        // 变形: soutp / soutm / soutv / xxx.souv
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TempleteTest.main");

        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        // 模板三：fori
        String[] arr = new String[] {"Tom", "Jerry", "Han Meimei", "Li Lei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 变形：iter
        for (String s : arr) {
            System.out.println(s);
        }

        // 模板四：list.for
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Integer num : list) {
            System.out.println(num);
        }

        // 变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        // 变形：list.forr 倒序
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        // 模板五：ifn
        List<String> list2 = null;

        if (list2 == null) {

        }

        // 变形：inn
        if (list2 != null) {

        }

        // 变形：xxx.null / xxx.nn
        if (list2 == null) {

        }

        if (list2 != null) {

        }
    }

    private void testUpdate() {
        System.out.println("test");
    }
}
