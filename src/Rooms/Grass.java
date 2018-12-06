package Rooms;

import People.Person;

public class Grass extends Room
{
    boolean hasMon = false;
    public Grass(int x, int y)
    {
        super(x,y);
    }

    @Override
    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        if(hasMon == false)
        {
            System.out.println("This grass is empty");
        }
        else if(hasMon == true)
        {
            System.out.println("You encountered a wild battler");
            System.out.println("It is");
        }
    }
}
