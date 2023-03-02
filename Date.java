public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int dateMonth, int dateDay, int dateYear) {
        month = dateMonth;
        day = dateDay;
        year = dateYear;
    }
    
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    } 
    public int getYear() {
        return year;
    }

    public String toString() {
        String result = "";
        if (month < 10) {
            result = result + 0 + month + "/";
        } else {
            result = result + month + "/";
        }
        if (day < 10) {
            result = result + 0 + day + "/";
        } else {
            result = result + day + "/";
        }
        if (year < 10) {
            result = result + 0 + 0 + 0 + year;
        } else if (year < 100) {
            result = result + 0 + 0 + year;
        } else if (year < 1000) {
            result = result + 0 + year;
        } else {
            result = result + year;
        }
        return result;
    }
    public static void main(String[] args) {

        final int NTESTS = 3;
        for (int trial = 0; trial < NTESTS; trial++) {
            int month = (int) (Math.random() * 12)  + 1;
            int day = (int) (Math.random() * 28)  + 1;
            int year = (int) (Math.random() * 2050)  + 1;

            Date d1 = new Date(month, day, year);
            System.out.println("Made a date with month = " + month + ", day = " + day + ", year = " + year);
            System.out.println("Which is represented by: " + d1);


        }
        
    }
}