
/**
 * A program that keeps track of trains, fuel, stops, and allows movement of said train.
 *
 * @author Kevin Lo
 * @version 2020-09-24
 */
public class Train
{
    private int currentStop;
    private int powerUnits;
    private int direction;
    public static final int FIRST_STOP_NUMBER = 1;
    public static final int LAST_STOP_NUMBER = 10;
    public static final int FORWARD = 1;
    public static final int REVERSE = -1;
    public static final int MAX_POWER_UNITS_TO_ADD = 6;
    public static final int MAX_POWER_UNITS = 10;
    public static final int INITIAL_POWER_UNITS = 2;

    /**
     * Constructor for objects of class Train
     */
    public Train()
    {
        currentStop = FIRST_STOP_NUMBER;
        powerUnits = INITIAL_POWER_UNITS;
        direction = FORWARD;
    }

    /**
     * Returns the direction the train is moving as a String
     *
     * 
     * @return    A String with the direction of the train
     */
    public String getDirection()
    {
        if (direction == 1)
        {
            return "Forward";

        }
        else
        {
            return "Reverse";
        }
    }

    /**
     * Gets the number of power units in the train's tank.
     * 
     * @return The number of power units in the train's tank.
     */
    public int getPowerUnits()
    {
        return powerUnits;

    }

    /**
     * Gets the current stop of this train
     * 
     * @return An integer representing the stop of the train is at
     */
    public int getStop()
    {
        return currentStop;
    }

    /**
     * Adds 6 power units of fuel ot the train's tank.
     * 
     */
    public void addFuel()
    {
        powerUnits += MAX_POWER_UNITS_TO_ADD;

        if (powerUnits > MAX_POWER_UNITS)
        {
            powerUnits = MAX_POWER_UNITS;
        }

    }

    /**
     * Reverses the direction of the train
     */
    public void turn()
    {
        direction = direction * REVERSE;
    }

    /**
     * Moves the Train Object specified number of stops in the current direction
     * 
     * @param numberOfStops The number of stops the train should move
     */
    public void move(int numberOfStops)
    {
        if (numberOfStops <= powerUnits)
        {
            currentStop = currentStop + (numberOfStops * direction);
            powerUnits -= numberOfStops;
            if (currentStop > LAST_STOP_NUMBER)
            {
                currentStop = LAST_STOP_NUMBER;
            }
            else if (currentStop < FIRST_STOP_NUMBER)
            {
                currentStop = FIRST_STOP_NUMBER;
            }
           
        }
        else
        {
            currentStop = currentStop + (powerUnits * direction);
            powerUnits -= numberOfStops;
            if (currentStop > LAST_STOP_NUMBER)
            {
                currentStop = LAST_STOP_NUMBER;
            }
            else if (currentStop < FIRST_STOP_NUMBER)
            {
                currentStop = FIRST_STOP_NUMBER;
            }
            
            if (powerUnits <= 0)
            {
                powerUnits = 0;
            }
            else
            {
                powerUnits = powerUnits;
            }
        }
    }

}
