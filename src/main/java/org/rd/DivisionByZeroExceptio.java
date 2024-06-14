package org.rd;

public class DivisionByZeroException extends Exception {
    private String message;

    public DivisionByZeroException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}