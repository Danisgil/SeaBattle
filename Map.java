package com.company;

public class Map {
    private final static int MAP_SIZE = 10;
    private final static  int DEFAULT_LEVEL = 3;
    int[][][] map = new int[MAP_SIZE][MAP_SIZE][DEFAULT_LEVEL];

    public void Map(){
        int level = 0;
        while (level < 3) {
            for (int i = 0; i < MAP_SIZE; i++) {
                for (int j = 0; j < MAP_SIZE; j++) {
                    map[i][j][level] = 0;
                }
            }
            level++;
        }
    }

    public void showMap(int level){
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j][level] != 0 && map[i][j][level] != 1){
                    System.out.print((char) map[i][j][level] + " ");
                }else{
                    System.out.print((short) (map[i][j][level]) + " ");
                }
            }
            System.out.println();
        }
    }
    public void setMap(int x, int y, int z){
        if (map[x][y][z] == 0){
            map[x][y][z] = '-';
        }
        if (map[x][y][z] == 1){
            map[x][y][z] = 'X';
        }
    }
}
