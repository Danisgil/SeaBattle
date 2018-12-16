package com.company;

public class GameUser {
    private int shipPoint = 60;
    Map map;
    //int countShip;

    GameUser (Map map){
        this.map = map;
    }

    public void setShipPoint(int x, int y, int z){
        map.setMap(x,y,z);
        shipPoint -= 1;
    }
    public int getShipPoint(){
        return shipPoint;
    }
}
