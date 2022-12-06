public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int h, int m , int s)
    {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public int getHours()
    {
        return hours;
    }

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

    public String toString()
    {
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
    }
}
