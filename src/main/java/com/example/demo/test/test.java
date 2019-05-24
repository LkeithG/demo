package com.example.demo.test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

    }
    public void test2(Long num) {
        System.out.println("num = [" + num + "]");

    }

    public static void test3() {
        String[] strs = new String[]{"1", "2", "3", "4"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        for (String str : strs) {
            System.out.println(str);
        }
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            System.out.println(str);
        }
    }

    public static void test4() {
        ArrayList<Long> longs = new ArrayList<>();
        longs.add(123L);
        longs.add(234L);
        longs.add(456L);
        longs.add(789L);
        for (Long aLong : longs) {
            System.out.println(aLong);
        }
        System.out.println("正序输出");
        for (int i = 0; i < longs.size(); i++) {
            System.out.println(longs.get(i));
        }
        System.out.println("倒序输出");
        for (int i = longs.size() - 1; i >= 0; i--) {
            System.out.println(longs.get(i));
        }
    }
}
