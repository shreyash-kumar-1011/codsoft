 import java.util.Scanner;
 public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rateUSD = 83.10;
        double rateEUR = 90.45;
        System.out.println("Choose base currency (1-INR): ");
        int base = sc.nextInt();
        System.out.println("Choose target currency (1-USD, 2-EUR): ");
        int target = sc.nextInt();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double converted = 0;
        if (base == 1 && target == 1) {
            converted = amount / rateUSD;
            System.out.println("INR to USD: $" + converted);
        } else if (base == 1 && target == 2) {
            converted = amount / rateEUR;
            System.out.println("INR to EUR: EUR" + converted);
        } else {
            System.out.println("Invalid Option");
        }
    }
 }