package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println(Calculate(a,b));
        System.out.println(StringName(a,b));
    }
    public static int Calculate (int a, int b){
        return a + b;
    }
    public static String StringName (int a, int b){
        return Calculate(a,b) >=0 ? "положительный":"отрицательный";
    }

}