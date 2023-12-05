public class Time {
    /**
     * Where everything related to the Time class gets coded
     */
    private int seconds;
    private int minutes;
    private int hours;

    /**
     * Represents one clock
     * @param hour represents the hours on the clock
     * @param minute represents the minutes on the clock
     * @param second represents the seconds on the clock
     */
    public Time(int hour, int minute, int second) {
        seconds = second;
        minutes = minute;
        hours = hour;
    }

    /**
     * Makes the clock tick forward one second
     * It adds 1 to the seconds on the clock
     * If seconds ends up being 60, then the method will make seconds 0 and add one to minutes
     * After that, if minutes ends up being 60, then the method will make minutes 0 and add one to hours
     * Finally, if hours ends up being 24, then the method will set hours to 0
     */
    public void tick() {
        seconds++;
        if (seconds == 60){
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24){
                    hours = 0;
                }
            }
        }
    }

    /**
     * Adds all the aspects of one clock to another
     * @param t represents the other time that must be added to the original clock
     * It adds all the respective time amounts (seconds, minutes, and hours) to the other clock
     * After that, if seconds or minutes ends up being 60 or greater, then it will add one to the time unit above and become the added amount - 60
     * If hours ends up being 24, then it will turn to 0
     * If hours ends up being greater than 24, then it will become the added hours - 24
     */
    public void add(Time t) {
        seconds = seconds + t.seconds;
        if (seconds >= 60){
            minutes++;
            seconds = seconds - 60;
        }
        minutes = minutes + t.minutes;
        if (minutes >= 60) {
            hours++;
            minutes = minutes - 60;
        }
        hours = hours + t.hours;
        if (hours == 24) {
            hours = 0;
        }
        else if (hours > 24){
            hours = hours - 24;
        }
    }

    /**
     * Prints all the info of a clock in digital clock form
     * It first adds 0 to the beginning of each unit of time that is a single digit
     * @return adds colons in between the amounts and returns them all together
     */
    public String toString() {
        String hour = "";
        if (hours >= 10) {
            hour = hour + hours;
        }
        else if (hours < 10) {
            hour = hour + "0" + hours;
        }
        String minute = "";
        if (minutes >= 10) {
            minute = minute + minutes;
        }
        else if (minutes < 10) {
            minute = minute + "0" + minutes;
        }
        String second = "";
        if (seconds >= 10) {
            second = second + seconds;
        }
        else if (seconds < 10) {
            second = second + "0" + seconds;
        }
        return hour + ":" + minute + ":" + second;
    }
}
