package Game;

import Rooms.Room;

public class Board
{

    public Room[][] map;
    public Board(Room[][] map2)
    {
        this.map = map2;
    }
    public Board(int x, int y)
    {
        this.makeMap(x,y);
    }
    public void makeMap(int x,int y)
    {
        map = new Room[x][y];
        for(int i = 0;i<map.length;i++)
        {
            for(int z = 0; z<map[i].length;z++)
            {
                map[i][z] = new Room(i,z);
            }
        }
    }
    public void print()
    {
        String row = "";
        for(int i = 0; i<map.length;i++)
        {
            row = "";
            for(int x = 0;x<map[i].length;x++)
            {
                row = row + map[i][x].toString();
            }
            System.out.println(row);
        }
    }

    public Room[][] getMap() {
        return map;
    }
}
