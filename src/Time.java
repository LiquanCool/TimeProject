/**
 * The Time class represents the time. The time is recorded in hours, minutes, and seconds.
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Constructor for the Time class. This creates a new instance of Time given the parameters.
     * @param h represents the hours
     * @param m represents the minutes
     * @param s represents the seconds
     */
    public Time(int h, int m , int s)
    {
        hours = h;
        minutes = m;
        seconds = s;
    }

    /**
     * The getSeconds method will return the seconds
     * @return returns seconds as an integer
     */
    public int getSeconds()
    {
        return seconds;
    }
    /**
     * The getMinutes method will return the minutes
     * @return returns minutes as an integer
     */
    public int getMinutes()
    {
        return minutes;
    }
    /**
     * The getHours method will return the hours
     * @return returns hours as an integer
     */
    public int getHours()
    {
        return hours;
    }

    /**
     * The tick method will add 1 second to the time which represents 1 second passing, it will also
     * increase or set to zero minutes and hours if it goes above the standard limit.
     */
    public void tick()
    {
        seconds++;
        if (seconds>=60)
        {
            seconds-=60;
            minutes++;
        }
        if (minutes>=60)
        {
            minutes-=60;
            hours++;
        }
        if (hours>=24)
        {
            hours-=24;
        }
    }

    /**
     * The add method will add two times together by adding each specific variable to each other, it will also
     *      * increase or set to zero minutes and hours if it goes above the standard limit.
     * @param t
     */
    public void add(Time t)
    {
        seconds+=t.getSeconds();
        minutes+=t.getMinutes();
        hours+=t.getHours();
        if (seconds>=60)
        {
            seconds-=60;
            minutes++;
        }
        if (minutes>=60)
        {
            minutes-=60;
            hours++;
        }
        if (hours>=24)
        {
            hours-=24;
        }
    }

    /**
     * The toString method will return a string with the time, padded with 1 zero if a value is single digit and separated by colons
     * @return
     */
    public String toString()
    {
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
    }
}