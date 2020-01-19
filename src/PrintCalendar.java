import java.util.Scanner;

public class PrintCalendar {
    /** Main Method */
    public static void main(String [] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter
        System.out.print("Enter a full year (e.g., 2012): ");
        int year = input.nextInt();

        // Prompt user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print the calendar for the month of the year
        printMonth(year, month);
    }


    /** A stub for printMonth may look like this */
    public static void printMonth(int year, int month){
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    /** A stub for printMothTitle may look like this */
    public static void printMonthTitle(int year, int month){
        String monthName = getMonthName(month);

        System.out.printf("%15s %d\n", monthName, year);
        System.out.println("------------------------------");
    }

    /** A stub for printMothBody may look like this */
    public static void printMonthBody(int year, int month){
        int numberOfDays = getNumberOfDaysInMonth(year, month);
        int startDay = getStartDay(year, month);

        // Print out Days of the week
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");

        // Print correct spacing for start day
        for(int i = 0; i < startDay; i++){
            System.out.printf("%4s", " ");
        }

        // Print the body of the Calendar
        for(int i = 1; i <= numberOfDays; i++){
            System.out. printf("%4d", i);
            if((i + startDay) % 7 == 0){
                System.out.println();
            }
        }
    }

    /** A stub for getMonthName may look like this */
    public static String getMonthName(int month){
        String name = "Not Valid";

        switch(month){
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name = "July";
                break;
            case 8:
                name = "August";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;
        }
        return name;
    }

    /** A stub for getStartDay may look like this */
    public static int getStartDay(int year, int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800 ) % 7;
    }

    /** A stub for printTotalNumberOfDays may look like this */
    public static int getTotalNumberOfDays(int year, int month){
        int totalDays = 0;
        for(int i = 1800; i < year; i++){
            for(int j = 1; j <= 12; j++){
                totalDays += getNumberOfDaysInMonth(i, j);
            }
        }

        for(int i = 1; i < month; i++){
            totalDays += getNumberOfDaysInMonth(year, i);
        }

        return totalDays;
    }

    /** A stub for getNumberOfDaysInMonth may look like this */
    public static int getNumberOfDaysInMonth(int year, int month){
        int numberOfDays = 0;
        boolean isLeapYear = isLeapYear(year);

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                if(isLeapYear) {
                    numberOfDays = 29;
                }
                else {
                    numberOfDays = 28;
                }
                break;
        }

        return numberOfDays;
    }

    /** A stub for isLeapYear may look like this */
    public static boolean isLeapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

}
