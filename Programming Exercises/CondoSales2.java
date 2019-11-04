import java.util.Scanner;

public class CondoSales2 {
    public static void main(String[] args) {
        int parkPrice = 150000;
        int golfPrice = 170000;
        int lakePrice = 210000;
        int garagePrice = 5000;
        int garage;
        int totalQuota = 0;

        System.out.println("Please pick a view: \n1 - park view \n2 -golf course view \n3 - lake view \nSelect view: ");
        Scanner condoSelect = new Scanner(System.in);
        while (!condoSelect.hasNextInt()){
            System.out.println("Please pick a view: ");
            condoSelect.nextLine();
        }
        int userSelect = condoSelect.nextInt();
        if (userSelect == 1) {
            totalQuota = parkPrice;
            System.out.println("The price of the park view condo is $" + parkPrice);
        } else if (userSelect == 2) {
            totalQuota = golfPrice;
            System.out.println("The price of the golf course view condo is $" + golfPrice);
        } else if(userSelect == 3) {
            totalQuota = lakePrice;
            System.out.println("The price of the lake view condo is $" + lakePrice);
        } else {
            System.out.println("No item is selected. The price is $0");
        }

        System.out.println("Would you like a parking space or garage? \n1 - parking space \n2 - garage (will incur an additional $5000) \nSelect your option");
        Scanner garageSelect = new Scanner((System.in));
        while (!garageSelect.hasNextInt()){
            System.out.println("Please pick a view: ");
            garageSelect.nextLine();
        }
        garage = garageSelect.nextInt();
        if (garage == 1) {
            System.out.println("Your final quota with a parking space is $" + totalQuota);
        } else {
            totalQuota = totalQuota + garagePrice;
            System.out.println("Your final quota with a garage is $" + totalQuota);
        }
    }
}
