import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int randomNumber;
        randomNumber = (int)(Math.random() * 100);
        System.out.println("Welcome to the Guessing Game!");
        Scanner scanner = new Scanner (System.in);


        int guess;
        do {
            System.out.println("Guess a number between 1 and 100");
            guess = scanner.nextInt();
            System.out.println("Your guess is " + guess);

            if (guess == randomNumber)
                System.out.println("Congrats your guess is correct!");
            else if (guess < randomNumber)
                System.out.println("Your number is too small");
            else if (guess > randomNumber)
                System.out.println("Your number is too large");
        } while  (guess != randomNumber);
    }
}
