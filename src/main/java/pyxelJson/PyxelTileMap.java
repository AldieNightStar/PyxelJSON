package pyxelJson;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class PyxelTileMap {
    public int tilewidth = 0;
    public int tileheight = 0;
    public int tileswide = 0;
    public int tileshigh = 0;
    public List<PyxelLayer> layers = new LinkedList<>();

    public PyxelLayer getLayer(String name) {
        for (PyxelLayer layer : layers) {
            if (layer.name.equalsIgnoreCase(name)) {
                return layer;
            }
        }
        return null;
    }

    public PyxelLayer getLayer(String name, String standard) {
        PyxelLayer layer = getLayer(name);
        if (layer == null) return getLayer(standard);
        return layer;
    }

    public static PyxelTileMap load(File file) throws FileNotFoundException {
        Gson gson = new Gson();
        return gson.fromJson(new FileReader(file), PyxelTileMap.class);
    }
}
