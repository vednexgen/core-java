package org.nexgen.exception.excephandling;

public class InvalidPasswordException extends RuntimeException {

    public InvalidPasswordException(String msg) {
        super(msg);
    }

}
