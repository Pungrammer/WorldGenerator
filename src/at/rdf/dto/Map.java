package at.rdf.dto;

/**
 * This class represents the main map which is generated.
 */

public class Map {

    private Tile[][] tiles;

    public Map(final int width, final int height){
        tiles = new Tile[width][height];
    }

    public Tile getTileAt(final int width, final int height){
        return tiles[height][width];
    }



}
