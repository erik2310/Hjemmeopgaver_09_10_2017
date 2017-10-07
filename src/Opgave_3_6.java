import java.util.Scanner;

public class Opgave_3_6 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter feet
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        // Prompt the user to enter inches
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        // Compute BMI
        double weightInPounds = weight * 703;
        double heightInInches = (feet * 12) + inches;

        double bmi = weightInPounds /
                (heightInInches * heightInInches);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");


    }
}

