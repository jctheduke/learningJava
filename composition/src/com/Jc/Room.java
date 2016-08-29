package com.Jc;

public  class Room {

    // dimensions
    Dimensions demen;
    // furniture in the room
    Furniture furni;
    // doors and windows

    public Room(Dimensions demen, Furniture furni) {
        this.demen = demen;
        this.furni = furni;
    }

    public Dimensions getDemen() {
        return demen;
    }

    public Furniture getFurni() {
        return furni;
    }

    // materials and colors


}