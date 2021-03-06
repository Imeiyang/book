package org.book.error.exception;

public class BasicException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private int code = 0;

    public BasicException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

}
