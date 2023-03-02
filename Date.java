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
        
    }
}