public class TimeV2 {

    private int secondsTotal;

    public TimeV2(int timeHours, int timeMinutes, int timeSeconds) {
        secondsTotal = (timeHours * 3600) + (timeMinutes * 60) + timeSeconds;
    }

    public int getHours() {
        int hours = secondsTotal / 3600;
        return hours;
    }
    public int getMinutes() {
        int afterHours = secondsTotal - getHours()*3600;
        int minutes = afterHours / 60;
        return minutes;
    }
    public int getSeconds() {
        int afterMinutes = secondsTotal - getHours()*3600 - getMinutes()*60;
        int seconds = afterMinutes;
        return seconds;
    }

    public String toString() {
        String result = "";
        if (getHours() == 0) {
            result = result + 0 + 0 + ":";
        } else if (getHours() < 10) {
            result = result + 0 + getHours() + ":";
        } else {
            result = result + getHours() + ":";
        }
        if (getMinutes() == 0) {
            result = result + 0 + 0 + ":";
        } else if (getMinutes() < 10) {
            result = result + 0 + getMinutes() + ":";
        } else {
            result = result + getMinutes() + ":";
        }
        if (getSeconds() == 0) {
            result = result + 0 + 0;
        } else if (getSeconds() < 10) {
            result = result + 0 + getSeconds();
        } else {
            result = result + getSeconds();
        }
        return result;
    }

    public static void main(String[] args) {
        // final int NTESTS = 3;
        // for (int trial = 0; trial < NTESTS; trial++) {
        //     int secondsTotal = ((int) Math.random()*86400 + 1)

        //     TimeV2 d1 = new TimeV2(hours);
        //     System.out.println("Made a time with hours = " + hours + ", minutes = " + minutes + ", seconds = " + seconds);
        //     System.out.println("Which is represented by: " + d1);



        final int NTESTS = 3;
        for (int trial = 0; trial < NTESTS; trial++) {
            int hours = (int) (Math.random() * 24)  + 1;
            int minutes = (int) (Math.random() * 60)  + 1;
            int seconds = (int) (Math.random() * 60)  + 1;

            TimeV2 d1 = new TimeV2(hours, minutes, seconds);
            System.out.println("Made a time with hours = " + hours + ", minutes = " + minutes + ", seconds = " + seconds);
            System.out.println("Which is represented by: " + d1);
        }
    }
}
