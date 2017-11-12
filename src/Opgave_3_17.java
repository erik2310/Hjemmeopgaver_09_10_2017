import java.util.Random;
import java.util.Scanner;

public class Opgave_3_17 {

    // Lavet af Erik Ruhmanis

    public static void main(String[] args) {

        // Deklarer nødvendige variabler
        int computerNumber, playerNumber;
        String computerRepresenter, playerRepresenter;

        // Laver et random objekt af klassen Random.
        Random random = new Random();

        // Gemmer et tal mellem 0 og 2 i computerNumber
        computerNumber = random.nextInt(3);

        if (computerNumber == 0) { // Hvis computeren får 0 er han scissor
            computerRepresenter = "scissor";
        } else if (computerNumber == 1) { // Hvis computeren får 1 er han rock
            computerRepresenter = "rock";
        } else { // Hvis computeren ikke får 0 eller 1 er han paper
            computerRepresenter = "paper";
        }

        // Laver et input objekt af klassen Scanner
        Scanner input = new Scanner(System.in);

        // Beder brugeren om at vælge mellem scissor, rock og paper
        System.out.print("scissor (0), rock (1), paper (2): ");
        playerNumber = input.nextInt();

        if (playerNumber == 0) { // Hvis spilleren vælger 0 er han scissor
            playerRepresenter = "scissor";
        } else if (playerNumber == 1) { // Hvis spilleren vælger 1 er han rock
            playerRepresenter = "rock";
        } else { // Hvis spilleren ikke vælger 0 eller 1 er han paper
            playerRepresenter = "paper";
        }

        // Udskriver hvad computeren har valgt og hvad brugeren har valgt
        System.out.print("The computer is " + computerRepresenter + ". You are " + playerRepresenter + ". ");

        // Finder ud af hvem der har vundet
        if (computerRepresenter == "scissor" && playerRepresenter == "paper" || computerRepresenter == "rock" && playerRepresenter == "scissor" || computerRepresenter == "paper" && playerRepresenter == "rock") {
            System.out.print("You lost.");
        } else if (computerRepresenter == "paper" && playerRepresenter == "scissor" || computerRepresenter == "scissor" && playerRepresenter == "rock" || computerRepresenter == "rock" && playerRepresenter == "paper") {
            System.out.print("You won.");
        } else {
            System.out.print("It's a draw.");
        }

    }

}
