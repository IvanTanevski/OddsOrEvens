import java.util.Scanner;
import java.util.Random;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called Odds and Evens");
        System.out.print("What is your name: ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose: 'O' or 'E'? ");
        String choice = input.next();
        if (choice.equalsIgnoreCase("O")) {
            System.out.println(name + " has picked Odds. The computer will be Evens.");
        } else if (choice.equalsIgnoreCase("E")) {
            System.out.println(name + " has picked Evens. The computer will be Odds.");
        }

        System.out.println("----------------------------------------");
        System.out.println();

        System.out.print("How many fingers do you put out? ");
        int userNumber = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays "+computer+" numbers");
        System.out.println("----------------------------------------");
        System.out.println();
        int sum = userNumber + computer;
        System.out.println(userNumber + " + " + computer + " = " + sum);
        boolean OddOrEven = sum % 2 == 0;
        if (OddOrEven){
            System.out.println(sum + " is Even");
            if (choice.equalsIgnoreCase("E")){
                System.out.println("The user wins!");
            } else {
                System.out.println("Computer wins!");
            }
        } else {
            System.out.println(sum + " is Odd");
            if (choice.equalsIgnoreCase("O")){
                System.out.println("The user wins!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        System.out.println("----------------------------------------");
        System.out.println();
    }
}
