package com.xworkz.tiles.tile;

public class Tile {
    private int uniqueId;
    private int xCoordinate;
    private int yCoordinate;
    private int width;
    private int height;
    private int textureCode;
    private String name;

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }
    public int getUniqueId() {
        return uniqueId;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public void setTextureCode(int textureCode) {
        this.textureCode = textureCode;
    }
    public int getTextureCode() {
        return textureCode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}