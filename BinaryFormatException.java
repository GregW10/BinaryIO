//
// Created by mario on 20/07/2022
//

public class BinaryFormatException extends Exception {
    BinaryFormatException() {
        super("The string entered is not in a proper binary format.");
    }
    BinaryFormatException(String message) {
        super(message);
    }
}