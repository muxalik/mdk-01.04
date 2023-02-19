public class WrongPasswordException extends Throwable {
    public WrongPasswordException() {
        
    }

    public WrongPasswordException(String message) {
        throw new Exception(message);
    }
}

