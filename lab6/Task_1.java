package lab6;

/**
 *
 * @author Davydov
 */
public class Task_1 {
    public static void main(String[] args) {
        final int nanoseconds_per_scond = 1000000000, milliseconds_per_second = 1000, seconds_per_minute = 60,
                minutes_per_hour = 60, hours_per_day = 24;
        long totalNanoseconds, totalMilliseconds, totalSeconds, currentSecond,
                totalMinutes, currentMinute, totalHours, currentHour;
        totalMilliseconds =  System.currentTimeMillis();
        totalSeconds = totalMilliseconds / milliseconds_per_second;
        currentSecond = totalSeconds % seconds_per_minute;
        totalMinutes= totalSeconds / seconds_per_minute;
        currentMinute = totalMinutes % minutes_per_hour;
        totalHours = totalMinutes / minutes_per_hour;
        currentHour = totalHours % hours_per_day;
        currentHour += 7;
        System.out.println("Current Time: " + currentHour +":" + currentMinute + ":" + currentSecond);
    }
}
