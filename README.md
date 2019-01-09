# PyxelJSON
Read Pyxel JSON levels with java and gson. > Without boilerplate

```java
PyxelTileMap map = PyxelTileMap.load(new File("./assets/map01.json"));
PyxelLayer layer = map.getLayer("Layer 0");
PyxelTile tile   = layer.getTileAt(10, 10);
System.out.println("Tile is: " + tile.tile);
```

# Build
## Required
* Maven
* Java
## Do
```
git clone https://github.com/AldieNightStar/PyxelJSON.git
cd PyxelJson
mvn package
```
