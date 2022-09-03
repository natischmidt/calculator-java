import java.nio.channels.ScatteringByteChannel;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Booting up Calculator 3000 ...");
        System.out.println("Finished booting up Calculator 3000");

        boolean inuse = true;
        while(inuse){
            int choice = selectInput();
            switch (choice){
                case 4:
                    handleDivision();
                case 6:
                    inuse = false;
                    System.out.println("You've selected to quit the calculator. Goodbye!");
                    break;
            }
        }

    }

        public static int selectInput() throws InvalidAnswerException {
            List<Integer> acceptableAnswers = List.of(1, 2, 4, 5, 6);
            System.out.println("Type the corresponding number to select your desired operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6. Exit program");
            System.out.println("Your choice: ");
            int choice = scanner.nextInt();

            try {
            if (!acceptableAnswers.contains(choice)) {
                throw new InvalidAnswerException("Not a valid answer");
            }

            } catch (InvalidAnswerException e){
            System.out.println(e.getMessage());
            {
    }
        else {
            return choice;
        }
    }

    public static void handleAddition(){

    }

    public static void handleDivision(){
        System.out.println("You've opted for division");
        System.out.println("Enter your numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Enter your denominator: ");
        int denominator = scanner.nextInt();
        double quotient = Operations.divide(numerator, denominator);
        System.out.println("The result of " + numerator + " divided by " + denominator + " is " + quotient);
    }

}


