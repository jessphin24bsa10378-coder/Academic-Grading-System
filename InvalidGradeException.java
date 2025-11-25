
// This checks if the user enters a weird number (like -100 or 200)
public class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}