package org.example;

import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру a");
        int a = sc.nextInt();
        Check.checkNumber(a);
        System.out.println("Введите цифру b");
        int b = sc.nextInt();
        Check.checkNumber(b);
        sc.nextLine();
        System.out.println("Введите знак операции");
        String symbol = sc.nextLine();
        Calculate(a,b,symbol);
    }

    public static void Calculate(int a, int b, String symbol) {
        switch (symbol) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "/" -> System.out.println(a / b);
            case "*" -> System.out.println(a * b);
            default -> System.out.println("неверная операция");
        }

    }


}