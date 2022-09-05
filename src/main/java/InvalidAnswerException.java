public class InvalidAnswerException extends Exception {
    public InvalidAnswerException (){
        super("Enter a number between 1-6");
    }

public InvalidAnswerException(String message){
        super(message);
}
}