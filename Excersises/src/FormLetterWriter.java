/**
 * Created by Adroso360 on 15/08/2016.
 */
import java.util.Scanner;
public class FormLetterWriter {
    public static void main(String[] args) {
        String fname =  getName("Enter your First Name");
        String lname =  getName("Enter your Last Name");
        displaySalutation(lname);
        displaySalutation(lname, fname);

    }

    public static void displaySalutation(String cusLastname){

        System.out.println("Dear Mr. or Ms." + cusLastname + " Thank you for giving us your money.");
    }

    public static void displaySalutation(String cusLastname, String cusFirstname){

        System.out.println("Dear." + cusFirstname + " " + cusLastname + " Thank you for giving us your money.");

    }

    private static String getName(String message){
        Scanner reader = new Scanner(System.in);
        System.out.println(message);
        String n = reader.next();
        return n;
    }
}
