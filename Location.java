/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    
    /** Compares this Location to another. **/
    public boolean equals(Object ob) {
       if (this == ob) return true;
        if (ob instanceof Location)//проверка, создан ли ob на основе класса Location
        {
            Location loc = (Location) ob;//создание другого экземпляра класса Location
            if (xCoord == loc.xCoord && yCoord == loc.yCoord)//проверка равенства координат
                return true;
        }
        return false;
    }

    /** Provides a hashCode for each Location. **/
    public int hashCode() {
        return ((xCoord * 3) - 5 + yCoord);
    }
}