import java.util.*;
import java.time.*;
public class PastPresentFuture2
{
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

        LocalDate inputDate = LocalDate.of(year, month, day);

        if (inputDate.isBefore(currentDate)) {
            System.out.println(day + " " + month + " " + year + " is in the past");
        } else if (inputDate.equals(currentDate)) {
            System.out.println(day + " " + month + " " + year + " is today");
        } else {
            System.out.println(day + " " + month + " " + year + " is in the future");
        }
    }
}