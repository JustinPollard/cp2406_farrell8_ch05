import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int userInput;
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        if(userInput % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
