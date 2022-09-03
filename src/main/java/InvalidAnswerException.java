public class InvalidAnswerException extends Exception {
    public InvalidAnswerException (){
        super("Not a valid answer");
    }

public InvalidAnswerException(String message){
        super(message);
}
}