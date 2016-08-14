/**
 * Created by Adroso360 on 15/08/2016.
 */
import java.util.Scanner;
public class Billing {
    public static void main(String[] args) {
        double price = getNummmms("Price of Item");
        double quant = getNummmms("How Many Did you Order");
        double couValue = getNummmms("Discount?");

        System.out.println("Price with Tax  " + computeBill(price));
        System.out.println("Price with Tax and Quantity  " + computeBill(price, quant));
        System.out.println("Price with Tax, Quantity and Discount  " + computeBill(price, quant, couValue));

    }
    private static double computeBill(double price){
        return price*1.8;
    }

    private static double computeBill(double price, double quant){
        return (quant*price)*1.8;
    }
    private static double computeBill(double price, double quant, double coupValue){
        return ((quant*price) - coupValue)*1.8;
    }
    private static double getNummmms(String message){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println(message);
        return reader.nextDouble(); // Scans the next token of the input as an int.
    }

}
