package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = false;
        int n;
        Scanner sc = new Scanner(System.in);
        Map publicMap = new Map();
        Map playerMap = new Map();
        Map botMap = new Map();
        GameUser b = new GameUser(botMap);
        GameUser p = new GameUser(playerMap);
        //рандомное размещение кораблей бота - в разработке
        System.out.println("разместить корабли вручную(1) или случайно(2)");
        if (sc.nextLine().equals("1")){
            //ручное размещение - в процессе разработки
        }else{
            //рандомное размещение - в процессе разработки
        }
        while (gameOver = false){
            boolean shotdone = false;
            System.out.println("Введите глубину атаки");
            n = sc.nextInt();
            publicMap.showMap(n);
            //чёрная магия и на пару пробелов ниже карта игрока - доработка
            //p.map.showMap(n);
            while (shotdone = false){
                System.out.println("Для атаки введите 1, для смены глубины введите 2");
                if (sc.nextLine().equals("1")){
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    b.setShipPoint(x,y,n);
                    p.setShipPoint(k,l,c,); //атака бота доработать
                    shotdone = true;
                }else{
                    System.out.println("Введите глубину атаки");
                    n = sc.nextInt();
                    publicMap.showMap(n);
                    p.map.showMap(n);
                }
            }
            if (p.getShipPoint() == 0 || b.getShipPoint() == 0){
                gameOver = true;
            }
        }
    }
}
