package com.lambda;
public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {
            System.out.println("哈哈");
            }
        );
    }
}
