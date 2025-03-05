package se.lexicon.exceptions.workshop.CustomExceptions;

public class DuplicateNameException extends Exception {

    public DuplicateNameException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "DuplicateNameException: " + super.getMessage();
    }
}
