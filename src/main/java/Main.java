
import java.util.List;
import java.util.Scanner;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InvalidAnswerException {

        System.out.println("Booting up Calculator 3000 ...");
        System.out.println("Finished booting up Calculator 3000");
//break; was missing in this switch
        boolean inuse = true;
        while (inuse) {
            int choice = selectInput();
            switch (choice) {
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
                    break;
                case 6:
                    inuse = false;
                    System.out.println("You've selected to quit the calculator. Goodbye!");
                    break;
            }
        }

    }

    //moved methods for the operators into  main
    //using float instead of int and double here to get precise results of division
    private static void Division(){
        System.out.println("You've chosen  division");
        System.out.println("Enter your numerator: ");
        while (!scanner.hasNextFloat()) {scanner.next (); System.out.println("Input must be numbers");}
        float numerator = scanner.nextFloat();
        System.out.println("Enter your denominator: ");
        while  (!scanner.hasNextFloat()) {scanner.next (); System.out.println("Input must be numbers");}
        float denominator = scanner.nextFloat();
        float quotient = numerator / denominator;
        System.out.println(" The result of " + numerator + " divided by " + denominator + " is " + quotient);
    }

    private static void Addition() {
        System.out.println("You've chosen Addition");
        System.out.println("Enter your first addend: ");
        while  (!scanner.hasNextInt()) {scanner.next (); System.out.println("Input must be numbers");}
        int addend1 = scanner.nextInt();
        System.out.println("Enter the second addend: ");
        while  (!scanner.hasNextInt()) {scanner.next (); System.out.println("Input must be numbers");}
        int addend2 = scanner.nextInt();
        double sum = Operations.add(addend1, addend2);
        System.out.println(" The sum of " + addend1 + " and " + addend2 + " is " + sum);

    }

    private static void Subtraction() {
        System.out.println("You've chosen Subtraction");
        System.out.println("Enter the minuend: ");
        while  (!scanner.hasNextInt()) {scanner.next (); System.out.println("Input must be numbers");}
        int minuend = scanner.nextInt();
        System.out.println("Enter the subtrahend: ");
        while  (!scanner.hasNextInt()) {scanner.next (); System.out.println("Input must be numbers");}
        int subtrahend = scanner.nextInt();
        double difference = Operations.subtract(minuend, subtrahend);
        System.out.println(" The difference of " + minuend + " and " + subtrahend + " is " + difference);

    }

    public static void Squareroot() {
        System.out.println("You've chosen Square root");
        System.out.println("Enter the number: ");
        while  (!scanner.hasNextInt()) {scanner.next (); System.out.println("Input must be numbers");}
        int int1 = scanner.nextInt();
        double square = Operations.sqrt(int1);
        System.out.println("The squareroot of " + int1 + " is " + square);

    }

    public static void Multiplication() {
        System.out.println("You've chosen Multiplication");
        System.out.println("Enter the multiplicand: ");
        while  (!scanner.hasNextInt()) {scanner.next (); System.out.println("Input must be numbers");}
        int multiplicand = scanner.nextInt();
        System.out.println("Enter the multiplier: ");
        while  (!scanner.hasNextInt()) {scanner.next (); System.out.println("Input must be numbers");}
        int multiplier = scanner.nextInt();
        double product = Operations.multiply(multiplicand, multiplier);
        System.out.println("The product of" + multiplicand + " and " + multiplier + " is " + product);

    }

    // added a mehtod so the throw works

    public static int selectInput() throws InvalidAnswerException {
        List<Integer> acceptableAnswers = List.of(1, 2, 3,4, 5, 6);
        System.out.println("Type the corresponding number to select your desired operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square root");
        System.out.println("6. Exit program");
        int choice = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Your choice:  ");

        if (userInput.hasNextInt()) {
            choice = userInput.nextInt();
            try {
                if (!acceptableAnswers.contains(choice)) {
                    throw new InvalidAnswerException();
                }

            } catch (InvalidAnswerException e) {
                System.out.println(e.getMessage());
                throw e;
            }
             return choice;
        }
            else if (!userInput.hasNextInt()){

                System.out.println("Enter a number please.");
            }


        return choice;
    }}




    