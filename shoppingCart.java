import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] arg){

        // Shopping Cart Program
        Scanner scanner = new Scanner(System.in);

        String item ;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("What is the price of each? : ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total bill is " + currency + total);

        scanner.close();

    }
}
