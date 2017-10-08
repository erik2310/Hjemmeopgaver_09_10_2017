import java.util.Scanner;

public class Opgave_5_1 {

    public static void main(String[] args) {
        // Deklarer javaScore og initialisere den til at være 1
        int javaScore = 1;

        // Laver et input objekt af klassen Scanner
        Scanner input = new Scanner(System.in);

        while (javaScore >= 0) { // Kører det der er i while mens javaScore er større eller ligmed 0

            // Spørger om score og gemmer det i javaScore
            System.out.print("Enter your score: ");
            javaScore = input.nextInt();

            if (javaScore >= 60) { // Hvis javaScore er større eller ligmed 60
                System.out.println("You pass the exam.");
            } else { // Hvis javaScore ikke er større eller ligmed 60
                System.out.println("You don't pass the exam.");
            }
            System.out.println();
        }

    }

}
