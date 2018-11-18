package pyxelJson;

public class PyxelTile {
    public int x = 0;
    public int y = 0;
    public int rot = 0;
    public int index = 0;
    public boolean flipX = false;
    public boolean flipY = false;
    public int tile = 0;

    public PyxelTile copy(PyxelTile tile) {
        if (tile == null) return this;
        this.x = tile.x;
        this.y = tile.y;
        this.flipX = tile.flipX;
        this.flipY = tile.flipY;
        this.rot = tile.rot;
        this.tile = tile.tile;
        return this;
    }

    public static PyxelTile copyFrom(PyxelTile tile) {
        return new PyxelTile().copy(tile);
    }

    @Override
    public String toString() {
        return "PyxelTyle (" + tile + ")  x:" + x + " y:" + y;
    }
}
