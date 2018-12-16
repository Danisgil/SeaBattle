package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map m = new Map();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        System.out.println("Введите y");
        int y = sc.nextInt();
        System.out.println("Введите z");
        int z = sc.nextInt();
        m.setMap(x,y,z);
        System.out.println("Введите level");
        int level = sc.nextInt();
        m.showMap(level);
    }
}
