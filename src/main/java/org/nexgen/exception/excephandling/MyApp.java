package org.nexgen.exception.excephandling;

public class MyApp {

    public static void main(String[] args) {

        String username = IO.readln("Enter Username to validate: \n");

        String password = IO.readln("Enter Password to validate: \n");

        String message;

        try {
            message = UserPassValidator.validateUsername(username);
            IO.println(message);
        } catch (InvalidUsernameException e) {
            IO.println(e.getMessage());
        }

        try {
            message = UserPassValidator.validatePassword(password);
            IO.println(message);
        } catch (InvalidPasswordException e) {
            IO.println(e);
        }

    }

}
