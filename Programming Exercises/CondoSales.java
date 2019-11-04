import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args) {
        System.out.println("Please pick a view: \n1 - park view \n2 -golf course view \n3 - lake view \nSelect view: ");
        Scanner scanner = new Scanner(System.in);
        int parkPrice = 150000;
        int golfPrice = 170000;
        int lakePrice = 210000;

        while (!scanner.hasNextInt()){
            System.out.println("Please pick a view: ");
            scanner.nextLine();
        }
        int userSelect = scanner.nextInt();
        if (userSelect == 1) {
            System.out.println("The price of the park view condo is $" + parkPrice);
        } else if (userSelect == 2) {
            System.out.println("The price of the golf course view condo is $" + golfPrice);
        } else if(userSelect == 3) {
            System.out.println("The price of the lake view condo is $" + lakePrice);
        } else {
            System.out.println("No item is selected. The price is $0");
        }
    }
}
