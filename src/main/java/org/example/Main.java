package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        Scanner sc = new Scanner(System.in);
        String symbol = sc.nextLine();
        System.out.println(Calculate(a,b,symbol));
    }
    public static int Calculate (int a, int b,String symbol){
        if (symbol.equals(Symbol.Plus)){
            return a + b;
        } if (symbol.equals(Symbol.Minus)){
            return a - b;
        } if (symbol.equals(Symbol.Delete)){
            return a / b;
        } if (symbol.equals(Symbol.Umnozhit)) {
            return a * b;
        }
        return 0;
    }


}