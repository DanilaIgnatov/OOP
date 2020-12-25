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
    
    /** Method equals. **/
    public boolean equals(Object obj) {
        
        // Is obj a Location?
        if (obj instanceof Location) {
            
            // Privodim obj k tipu Location
            // Zatem sravnivaem
            Location other = (Location) obj;
            if (xCoord == other.xCoord && yCoord == other.yCoord) {
                return true;
            }
        }
        
        // False, if not equals
        return false;
    }

    /** hashCode for Location. **/
    public int hashCode() {
        int result = 1;

        result = result + xCoord;
        result = result + yCoord;
        return result;
    }
}
