import java.nio.channels.ScatteringByteChannel;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InvalidAnswerException {

        System.out.println("Booting up Calculator 3000 ...");
        System.out.println("Finished booting up Calculator 3000");
//break; was missing in this switch
        boolean inuse = true;
        while(inuse){
            int choice = selectInput();
            switch (choice){
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    Squareroot();
                case 6:
                    inuse = false;
                    System.out.println("You've selected to quit the calculator. Goodbye!");
                    break;
            }
        }

    }

    //moved methods for the operators into  main
    private static void Division() {
        System.out.println("You've chosen  division");
        System.out.println("Enter your numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Enter your denominator: ");
        int denominator = scanner.nextInt();
        double quotient = Operations.divide(numerator, denominator);
        System.out.println(" The result of " + numerator + " divided by " + denominator + " is " + quotient);
    }

private static void Addition (){
    System.out.println("You've chosen Addition");
    System.out.println("Enter your first addend: ");
    int addend1 = scanner.nextInt();
    System.out.println("Enter the second addend: ");
    int addend2 = scanner.nextInt();
    double sum = Operations.add(addend1,addend2);
    System.out.println(" The sum of " + addend1 + " and " + addend2 + " is " + sum);

}

    private static void Subtraction (){
        System.out.println("You've chosen Subtraction");
        System.out.println("Enter the minuend: ");
        int minuend = scanner.nextInt();
        System.out.println("Enter the subtrahend: ");
        int subtrahend = scanner.nextInt();
        double difference = Operations.subtract(minuend,subtrahend);
        System.out.println(" The difference of " + minuend + " and " + subtrahend + " is " + difference);

    }

    public static void Multiplication(){
        System.out.println("You've chosen Square root");
        System.out.println("Enter the number: ");
        int int1 = scanner.nextInt();
        double square  = Operations.squareroot(int1);
        System.out.println("The squareroot of" + int1 + " is " + square);

    }

    public static void Squareroot(){
        System.out.println("You've chosen Multiplication");
        System.out.println("Enter the multiplicand: ");
        int multiplicand = scanner.nextInt();
        System.out.println("Enter the multiplier: ");
        int multiplier = scanner.nextInt();
        double product  = Operations.multiply(multiplicand,multiplier);
        System.out.println("The product of" + multiplicand + " and " + multiplier + " is " + product);

    }

    public static int selectInput() throws InvalidAnswerException {
        List<Integer> acceptableAnswers = List.of(1, 2, 3,4, 5, 6);
        System.out.println("Type the corresponding number to select your desired operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square root");
        System.out.println("6. Exit program");
        System.out.println(" Your choice: ");
        int choice = scanner.nextInt();

        try {
            if (!acceptableAnswers.contains(choice)) {
                throw new InvalidAnswerException(" Not a valid answer ");
            }

        } catch (InvalidAnswerException e) {
            System.out.println(e.getMessage());

        }

        return choice;
    }}


