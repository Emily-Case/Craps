import java.util.Random;
import java.util.Scanner;

public class Craps{

    public static void main (String [] args){

        try (Scanner s = new Scanner(System.in)) {
            int start;
            int bet;
            Random dice1 = new Random();
            Random dice2 = new Random();

            System.out.print("Welcome to Craps, please insert the amount you wish to start with: ");
            start = s.nextInt();

            while(start > 0){

                System.out.print("Select the amount you want to bet: ");
                bet = s.nextInt();

                while(bet > start){

                    System.out.print("The amount you bet is invalid, please insert another value: ");
                    bet = s.nextInt();

    
                }    

                int diceOne = dice1.nextInt(6) + 1;
                int diceTwo = dice2.nextInt(6) + 1;
                int result = diceOne + diceTwo;
        
                System.out.println("The dice have rolled and the reuslt is: " + result);

                if(result == 7){
                    start += bet;
                }

                else{
                    start -= bet;
                }

                System.out.println("You currently have " + start + " in the bank.");

                if(start == 0){
                    System.out.println("You have lost all your money, BYE.");
                }

            }
        }
    }
}