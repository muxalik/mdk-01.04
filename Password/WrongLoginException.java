public class WrongLoginException extends Throwable {
    public WrongLoginException() {
        
    }

    public WrongLoginException(String message) {
        throw new Exception(message);
    }
}

