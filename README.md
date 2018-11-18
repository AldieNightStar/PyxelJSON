# PyxelJSON
Read Pyxel JSON levels with java and gson. > Without boliderplate

```java
PyxelTileMap map = PyxelTileMap.load(new File("./assets/map01.json"));
PyxelLayer layer = map.getLayer("Layer 0");
PyxelTile tile   = layer.getTileAt(10, 10);
System.out.println("Tile is: " + tile.tile);
```
