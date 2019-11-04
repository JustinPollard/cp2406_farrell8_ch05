import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int firstInput, secondInput, thirdInput;
        int firstPosition = 0, secondPosition = 0, thirdPosition = 0;
        System.out.println("Please enter the first number");
        Scanner scanner1 = new Scanner(System.in);
        firstInput = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        secondInput = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        thirdInput = scanner3.nextInt();

        if (firstInput > secondInput && firstInput > thirdInput) {
            firstPosition = firstInput;
        } else if (firstInput > secondInput && firstInput < thirdInput || firstInput < secondInput && firstInput > thirdInput) {
            secondPosition = firstInput;
        } else if (firstInput < secondInput && firstInput < thirdInput) {
            thirdPosition = firstInput;
        }

        if (secondInput > firstInput && secondInput > thirdInput) {
            firstPosition = secondInput;
        } else if (secondInput > firstInput && secondInput < thirdInput || secondInput > thirdInput && secondInput < firstInput) {
            secondPosition = secondInput;
        } else if (secondInput < firstInput && secondInput < thirdInput) {
            thirdPosition = secondInput;
        }

        if (thirdInput > firstInput && thirdInput > secondInput) {
            firstPosition = thirdInput;
        } else if (thirdInput > firstInput && thirdInput < secondInput || thirdInput > secondInput && thirdInput < firstInput) {
            secondPosition = thirdInput;
        } else if (thirdInput < secondInput && thirdInput < firstInput) {
            thirdPosition = thirdInput;
        }

        System.out.println("ASC: " + firstPosition + ", " + secondPosition + ", " + thirdPosition);
        System.out.println("DESC: " + thirdPosition + ", " + secondPosition + ", " + firstPosition);
    }
}
