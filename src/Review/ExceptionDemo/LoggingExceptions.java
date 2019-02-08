package Review.ExceptionDemo;

import com.sun.javafx.util.Logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {

    private static Logger logger = Logger.getLogger("Logging Exception");
    public LoggingException() {
        StringWriter writer = new StringWriter();
        printStackTrace(new PrintWriter(writer));
        logger.severe(writer.toString());
    }
}

public class LoggingExceptions{
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}
