import java.util.Random;
import java.util.Scanner;

/**
 * Pseudocode
 *
 * Declare variables
 * ask user to roll
 * add both numbers
 * assign sum to score
 * print score
 * while score is less than 100
 * Prompt user to roll
 * once they roll, display the numbers rolled
 * if both numbers are 1, add 25 to score
 * else if one of the dice is 1, skip a turn
 * once score is 100 it breaks out of the loop
 * display final score
 * display "you have scored over 100" & "thank you for playing!
 *
 *
 *
 * */



public class Dice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int low = 1;
        int high = 7;
        int score = 0;
        int result = (1 + r.nextInt(6));
        int result2 = (1 + r.nextInt(6));
        int temp;
        int newScore = 0;



        System.out.println("Welcome! Let's Play Roll Dice!");
        System.out.println("Your rolls: " +  result + " & " + result2);
//        result = (1 + r.nextInt(6));
//        result2 = (1 + r.nextInt(6));
        score = result + result2;
        System.out.println("Score: " + score);
            while (score < 100){
                System.out.println("Do you want to roll again?");
                String rollAgain = sc.nextLine();
                if (rollAgain.equalsIgnoreCase("yes")) {
//                    System.out.println("Your rolls: " + (1 + r.nextInt(6)) + " & " + (1 + r.nextInt(6)));
                    result = (1 + r.nextInt(6));
                    result2 = (1 + r.nextInt(6));
                    System.out.println("Your rolls: " +  result + " & " + result2);
                    if ((result == 1 && result2 == 1)) {
                        System.out.println("This is previous score: " + score);
                        temp = score;
                        newScore = (temp + 25);
                        score = newScore;
                        System.out.println("New score: " + score);
                    }
                    else if ((result == 1 || result2 == 1)) {
                        System.out.println("This is previous score: " + score);
                        System.out.println("New Score: " + score);
                    } else {
                        System.out.println("This is previous score: " + score);
                        temp = score;
                        newScore = (result + result2);
                        score = newScore + temp;
                        System.out.println("New Score: " + score);
                    }
                } else {
                    score = 100;
                    System.out.println();
                    System.out.println("This is your final score: " + score);

                }
            }
            sc.close();
            System.out.println("You have scored over 100!");
            System.out.println("Thank you for playing!");
        }
    }
