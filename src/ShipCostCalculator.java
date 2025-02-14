import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = .02;
        String trash = "";

        System.out.print("Please input your item price in USD: ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
            if (itemPrice < 100)
            {
                shipCost = itemPrice * SHIP_RATE;
            }
            totalCost = itemPrice + shipCost;
            System.out.println("your shipping cost is $" + shipCost);
            System.out.println("your total cost is $" + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("invalid Item Price " + trash);
            System.exit(0);
        }
    }
}