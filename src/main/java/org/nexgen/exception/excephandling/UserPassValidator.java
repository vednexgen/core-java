package org.nexgen.exception.excephandling;

public class UserPassValidator {

    public static String validateUsername(String username) throws InvalidUsernameException {
        boolean isNumber = username.matches(".*\\d.*");
        if(isNumber) {
            throw new InvalidUsernameException("Invalid Username");
        } else {
            return "Username is Okay!";
        }
    }

    public static String validatePassword(String password) {
        if(password.length() < 10) {
            throw new InvalidPasswordException("Invalid Password");
        } else {
            return "Password is okay";
        }

    }
}
