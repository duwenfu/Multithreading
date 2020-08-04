package com.example.demo.MultiThreading;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/28 1:24
 */
public class CreateThreadDemo7_Anonymous {
    public static void main(String[] args) {
        // 基于子类和接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    printInfo("interface");
                }
            }
        }) {
            @Override
            public void run() {
                while (true) {
                    printInfo("sub class");
                }
            }
        }.start();
    }

    /**
     * 输出当前线程的信息
     */
    private static void printInfo(String text) {
        System.out.println(text);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
