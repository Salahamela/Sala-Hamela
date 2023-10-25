import java.util.Scanner;

public class ActivityThreeSala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("1.C1 - Php 100.00");
        System.out.println("2.C2 - Php 150.00");
        System.out.println("3.C3 - Php 200.00");
        System.out.println("Add-ons: ");
        System.out.println("4.R1 - Php 35.00");
        System.out.println("5.R2 - Php 50.00");

        System.out.print("Enter your order: ");
        int itemCode = scanner.nextInt();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the add-ons code (0 if none): ");
        int addOnsCode = scanner.nextInt();

        double totalPrice = 0.0;

        if (itemCode == 1) {
            totalPrice = quantity * 100.00;
        } else if (itemCode == 2) {
            totalPrice = quantity * 150.00;
        } else if (itemCode == 3) {
            totalPrice = quantity * 200.00;
        }

        if (addOnsCode == 4) {
            totalPrice += quantity * 35.00;
        } else if (addOnsCode == 5) {
            totalPrice += quantity * 50.00;
        }

        System.out.println("Total Price Php: " + totalPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Order Code: " + itemCode);

        double exchangeRate = 0.018;
        double totalPriceUSD = totalPrice * exchangeRate;
        System.out.println("Total Price in US Dollar: $" + totalPriceUSD);

        scanner.close();
    }
}
