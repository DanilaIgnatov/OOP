import java.util.*;


/**
 * This class stores the basic state necessary for the A* algorithm to compute 
 * a path across a map.  This state includes a collection of "open waypoints" 
 * and another collection of "closed waypoints."  In addition, this class 
 * provides the basic operations that the A* pathfinding algorithm needs to 
 * perform its processing.
 **/
public class AStarState
{
    /** 
     * This is a reference to the map that the A* algorithm
     * is navigating.
     **/
    private Map2D map;

    /** Initialize open point **/
    private Map<Location, Waypoint> open_waypoints = new HashMap<Location, Waypoint> ();
    
    /** Initialize close points **/
    private Map<Location, Waypoint> closed_waypoints = new HashMap<Location, Waypoint> ();

    /**
     * Initialize a new state object for the A* pathfinding algorithm to use.
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    /** Returns the map that the A* pathfinder is navigating. **/
    public Map2D getMap()
    {

        return map;
    }

    /**
     * Etot metod skaniruet vse otkrytye putevye tochki i vozvrashchaet putevuyu
     * tochku s minimal'noy obshchey stoimost'yu.
     * Esli otkrytykh putevykh tochek net, etot metod vozvrashchaet null.
     **/
    public Waypoint getMinOpenWaypoint()
    {
        // Esli tochka ne otkrita vozvrashaem null
        if (numOpenWaypoints() == 0)
            return null;
        
        //*Iteraciya po naboru i poisk best tochki
        Set open_waypoint_keys = open_waypoints.keySet();
        Iterator i = open_waypoint_keys.iterator();
        Waypoint best = null;
        float best_cost = Float.MAX_VALUE;
        
        // Scaniruem all open tochki
        while (i.hasNext())
        {
            // Tekushee polozhenie
            Location location = (Location)i.next();
            // Tekushaee polozhenie tochki
            Waypoint waypoint = open_waypoints.get(location);
            // Stoimost tochki
            float waypoint_total_cost = waypoint.getTotalCost();
            
            //Zamena tekushei tochki na best
            if (waypoint_total_cost < best_cost)
            {
                best = open_waypoints.get(location);
                best_cost = waypoint_total_cost;
            }
            
        }
        // Returns min tochku
        return best;
    }

    /*Etot metod dobavlyaet putevuyu tochku v kollektsiyu "otkrytye putevye tochki"
    (ili potentsial'no obnovlyaet uzhe imeyushchuyusya putevuyu tochku).  Esli v mestopolozhenii
    novoy putevoy tochki eshche net otkrytoy putevoy tochki, to novaya putevaya
    tochka prosto dobavlyaetsya v kollektsiyu.  Odnako esli v mestopolozhenii novoy
    putevoy tochki uzhe est' putevaya tochka, to novaya putevaya tochka zapolnyaet
    staruyu tol'ko v tom sluchae, esli znachenie "predydushchey stoimosti" novoy putevoy
    tochki men'she znacheniya "predydushchey stoimosti" tekushchey putevoy tochki.
     */
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        // Polozhenie new tochki.
        Location location = newWP.getLocation();
        
        // Proveryaet, est' li uzhe otkrytaya putevaya tochka v mestopolozhenii novoy putevoy tochki.
        if (open_waypoints.containsKey(location))
        {
            //Esli v mestopolozhenii novoy putevoy tochki uzhe est' otkrytaya putevaya tochka,
            // prover'te, ne men'she li znachenie "predydushchey stoimosti" novoy putevoy tochki,
            // chem znachenie "predydushchey stoimosti" tekushchey putevoy tochki.
            Waypoint current_waypoint = open_waypoints.get(location);
            if (newWP.getPreviousCost() < current_waypoint.getPreviousCost())
            {
                /*
                Esli znachenie "predydushchey stoimosti" novoy putevoy tochki men'she znacheniya
                "predydushchey stoimosti" tekushchey putevoy tochki, novaya putevaya tochka
                zamenyaet staruyu putevuyu tochku i vozvrashchaet znachenie true.
                 */
                open_waypoints.put(location, newWP);
                return true;
            }
            /*
            Esli znachenie "predydushchaya stoimost'" novoy putevoy tochki
            ne men'she znacheniya "predydushchaya stoimost'" tekushchey
            putevoy tochki, vernite znachenie false.
            */
            return false;
        }
        /*
        Esli v mestopolozhenii novoy putevoy tochki eshche
        net otkrytoy putevoy tochki, dobav'te novuyu putevuyu
        tochku v kollektsiyu otkrytykh putevykh tochek
        i vernite znachenie true.
        */
        open_waypoints.put(location, newWP);
        return true;
    }


    /** Returns the number of open waypoints. **/
    public int numOpenWaypoints()
    {
        return open_waypoints.size();
    }

    /*
    Etot metod peremeshchaet putevuyu tochku v ukazannom meste iz otkrytogo spiska v zakrytyy.
    */
    public void closeWaypoint(Location loc)
    {
        Waypoint waypoint = open_waypoints.remove(loc);
        closed_waypoints.put(loc, waypoint);
    }

    /**
     Vozvrashchaet true, esli kollektsiya zakrytykh
     putevykh tochek soderzhit putevuyu tochku dlya ukazannogo mestopolozheniya.
     **/
    public boolean isLocationClosed(Location loc)
    {


        return closed_waypoints.containsKey(loc);
    }
}