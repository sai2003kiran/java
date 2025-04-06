package com.xworkz.tiles;
import com.xworkz.tiles.tile.Tile;

public class TilesRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // Tile 1
        Tile tile1 = new Tile();
        tile1.setUniqueId(101);
        tile1.setXCoordinate(10);
        tile1.setYCoordinate(20);
        tile1.setWidth(100);
        tile1.setHeight(200);
        tile1.setTextureCode(501);
        tile1.setName("Tile A");
        System.out.println("Unique ID: " + tile1.getUniqueId());
        System.out.println("X Coordinate: " + tile1.getXCoordinate());
        System.out.println("Y Coordinate: " + tile1.getYCoordinate());
        System.out.println("Width: " + tile1.getWidth());
        System.out.println("Height: " + tile1.getHeight());
        System.out.println("Texture Code: " + tile1.getTextureCode());
        System.out.println("Name: " + tile1.getName());
        System.out.println("*******Complete*********");

        // Tile 2
        Tile tile2 = new Tile();
        tile2.setUniqueId(102);
        tile2.setXCoordinate(15);
        tile2.setYCoordinate(25);
        tile2.setWidth(110);
        tile2.setHeight(210);
        tile2.setTextureCode(502);
        tile2.setName("Tile B");
        System.out.println("Unique ID: " + tile2.getUniqueId());
        System.out.println("X Coordinate: " + tile2.getXCoordinate());
        System.out.println("Y Coordinate: " + tile2.getYCoordinate());
        System.out.println("Width: " + tile2.getWidth());
        System.out.println("Height: " + tile2.getHeight());
        System.out.println("Texture Code: " + tile2.getTextureCode());
        System.out.println("Name: " + tile2.getName());
        System.out.println("*******Complete*********");

        // Tile 3
        Tile tile3 = new Tile();
        tile3.setUniqueId(103);
        tile3.setXCoordinate(20);
        tile3.setYCoordinate(30);
        tile3.setWidth(120);
        tile3.setHeight(220);
        tile3.setTextureCode(503);
        tile3.setName("Tile C");
        System.out.println("Unique ID: " + tile3.getUniqueId());
        System.out.println("X Coordinate: " + tile3.getXCoordinate());
        System.out.println("Y Coordinate: " + tile3.getYCoordinate());
        System.out.println("Width: " + tile3.getWidth());
        System.out.println("Height: " + tile3.getHeight());
        System.out.println("Texture Code: " + tile3.getTextureCode());
        System.out.println("Name: " + tile3.getName());
        System.out.println("*******Complete*********");

        // Tile 4
        Tile tile4 = new Tile();
        tile4.setUniqueId(104);
        tile4.setXCoordinate(25);
        tile4.setYCoordinate(35);
        tile4.setWidth(130);
        tile4.setHeight(230);
        tile4.setTextureCode(504);
        tile4.setName("Tile D");
        System.out.println("Unique ID: " + tile4.getUniqueId());
        System.out.println("X Coordinate: " + tile4.getXCoordinate());
        System.out.println("Y Coordinate: " + tile4.getYCoordinate());
        System.out.println("Width: " + tile4.getWidth());
        System.out.println("Height: " + tile4.getHeight());
        System.out.println("Texture Code: " + tile4.getTextureCode());
        System.out.println("Name: " + tile4.getName());
        System.out.println("*******Complete*********");

        // Tile 5
        Tile tile5 = new Tile();
        tile5.setUniqueId(105);
        tile5.setXCoordinate(30);
        tile5.setYCoordinate(40);
        tile5.setWidth(140);
        tile5.setHeight(240);
        tile5.setTextureCode(505);
        tile5.setName("Tile E");
        System.out.println("Unique ID: " + tile5.getUniqueId());
        System.out.println("X Coordinate: " + tile5.getXCoordinate());
        System.out.println("Y Coordinate: " + tile5.getYCoordinate());
        System.out.println("Width: " + tile5.getWidth());
        System.out.println("Height: " + tile5.getHeight());
        System.out.println("Texture Code: " + tile5.getTextureCode());
        System.out.println("Name: " + tile5.getName());
        System.out.println("*******Complete*********");

        System.out.println("Main Ended");
    }
}