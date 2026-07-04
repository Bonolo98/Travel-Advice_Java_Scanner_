import java.util.Scanner;

public class Hello {

    public static void main(String a[]) {

        // We declare our variables
        int myCash;
        String taxisAvailableAnswer;
        int brixtonFare = 20;

        // Build a progam that tells you if you can go to brixton via taxi.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To Travel Advice!!!");
        System.out.println("___________________________");

        // Enter Your Current Amount.
        // ------------------------------------------------------

        System.out.println("We help you know if you can take taxis based on the cash you have");
        System.out.println("___________________________");
        System.out.println("How Much Cash Do You Have? Enter Number: e.g '10'");

        myCash = scanner.nextInt();

        if (myCash < brixtonFare) {

            // If you don't have enough cash ---------------------

            System.out.println("You don't have enough cash for Brixton Taxis");
            scanner.close();

        } else if (myCash >= brixtonFare) {

            System.out.println("You have enough cash for Brixton taxi fare");
            System.out.println("------------------------------------------");
            System.out.println("Are Taxi's Available Where You Are?: Yes or No");
            taxisAvailableAnswer = scanner.next();
            taxisAvailableAnswer.toLowerCase();

            if (taxisAvailableAnswer.contains("yes") ||
                    taxisAvailableAnswer.contains("yeah")
                    || taxisAvailableAnswer.contains("yah")
                    || taxisAvailableAnswer.contains("ya")) {

                System.out.println("___________________________");
                System.out.println("Yes, There are taxis and you can afford a to take one to Brixton");

            } else if (taxisAvailableAnswer.contains("no") || taxisAvailableAnswer.contains("nop")
                    || taxisAvailableAnswer.contains("nah")) {
                System.out.println("___________________________");
                System.out.println("No, There are no taxis to Brixton");

                scanner.close();

                System.out.println("___________________________");
                System.out.println("Thank You For Using Travel Advice");

            }

        }
    }
}