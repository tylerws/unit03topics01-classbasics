public class TimeV1 {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeV1(int timeHours, int timeMinutes, int timeSeconds) {
        hours = timeHours;
        minutes = timeMinutes;
        seconds = timeSeconds;
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }

    public String toString() {
        String result = "";
        if (hours == 0) {
            result = result + 0 + 0 + ":";
        } else if (hours < 10) {
            result = result + 0 + hours + ":";
        } else {
            result = result + hours + ":";
        }
        if (minutes == 0) {
            result = result + 0 + 0 + ":";
        } else if (minutes < 10) {
            result = result + 0 + minutes + ":";
        } else {
            result = result + minutes + ":";
        }
        if (seconds == 0) {
            result = result + 0 + 0;
        } else if (seconds < 10) {
            result = result + 0 + seconds;
        } else {
            result = result + seconds;
        }
        return result;
    }
    public static void main(String[] args) {
        
        final int NTESTS = 3;
        for (int trial = 0; trial < NTESTS; trial++) {
            int hours = (int) (Math.random() * 24)  + 1;
            int minutes = (int) (Math.random() * 60)  + 1;
            int seconds = (int) (Math.random() * 60)  + 1;

            TimeV1 d1 = new TimeV1(hours, minutes, seconds);
            System.out.println("Made a time with hours = " + hours + ", minutes = " + minutes + ", seconds = " + seconds);
            System.out.println("Which is represented by: " + d1);
    }
}
}