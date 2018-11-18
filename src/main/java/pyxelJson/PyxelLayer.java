package pyxelJson;

import java.util.LinkedList;
import java.util.List;

public class PyxelLayer {
    public String name = "";
    public List<PyxelTile> tiles = new LinkedList<>();
    public int number = 0;

    public PyxelTile getTileAt(int x, int y) {
        for (PyxelTile tile : tiles) {
            if (tile.x == x && tile.y == y) {
                return tile;
            }
        }
        return null;
    }

    public void setTileAt(PyxelTile newTile, int x, int y) {
        for (PyxelTile tile : tiles) {
            if (tile.x == x && tile.y == y) {
                tile.copy(newTile);
                return;
            }
        }
        tiles.add(newTile);
    }

    @Override
    public String toString() {
        return "PyxelLayer: " + name +
                " tiles: " + tiles.size();
    }
}
