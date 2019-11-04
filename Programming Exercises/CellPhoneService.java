import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        int talkTime;
        int textMsgs;
        int gbData;
        System.out.print("Please enter the amount of talk minutes monthly: ");
        Scanner talkScanner= new Scanner(System.in);
        talkTime = talkScanner.nextInt();
        System.out.print("Please enter the amount of text messages sent monthly: ");
        Scanner textScanner = new Scanner(System.in);
        textMsgs = textScanner.nextInt();
        System.out.print("Please enter the amount of GB of data monthly: ");
        Scanner gbScanner = new Scanner(System.in);
        gbData = gbScanner.nextInt();

        if (talkTime < 500 && textMsgs == 0 && gbData == 0) {
            System.out.println("Customer should go with Plan A for $49/month");
        } else if (talkTime >= 500 && textMsgs < 0 && gbData == 0) {
            System.out.println("Customer should go with Plan B for $55/month");
        } else if (talkTime >= 500 && gbData == 0) {
            if (textMsgs <= 100) {
                System.out.println("Customer should go with Plan C for $61/month");
            } else {
                System.out.println("Customer should go with Plan D for $70/month");
            }
            //System.out.println("Plan C with 100 txt messages for $61/month \nPlan D with 100 or more txt messages for $70/month");
        } if (gbData > 0) {
            if (gbData <= 2) {
                System.out.println("Customer should go with Plan E for $79/month");
            } else {
                System.out.println("Customer should go with Plan F for $87/month");
            }
        }
    }
}
