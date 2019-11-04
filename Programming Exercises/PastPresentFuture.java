import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        int day;
        int month;
        int year;

        LocalDate currentDate = LocalDate.now();
        System.out.println("Enter a day: ");
        Scanner dayScanner = new Scanner(System.in);
        day = dayScanner.nextInt();
        System.out.println("Enter a month: ");
        Scanner monthScanner = new Scanner(System.in);
        month = monthScanner.nextInt();
        System.out.println("Enter a month: ");
        Scanner yearScanner = new Scanner(System.in);
        year = yearScanner.nextInt();

        int currentMonth = currentDate.getMonthValue();
        int currentYear = currentDate.getYear();

        if(year != currentYear) {
            System.out.println(day + " " + month + " " + year + " is not this year");
        } else if (month < currentMonth) {
            System.out.println(day + " " + month + " " + year + " was earlier in the year");
        } else if (month > currentMonth) {
            System.out.println(day + " " + month + " " + month + " is later this year");
        } else {
            System.out.println(month + " is this month");
        }

    }
}
