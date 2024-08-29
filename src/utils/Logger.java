package utils;

public class Logger {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public void info(String text) {
        System.out.println(text);
    }

    public void warn(String text) {
        System.out.println(ANSI_RED + text + ANSI_RESET);
    }
}
