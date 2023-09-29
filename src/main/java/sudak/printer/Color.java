package sudak.printer;

import java.util.Random;

/**
 * @author Yury Sudak
 */
public enum Color {
    RESET("\033[0m"),
    WHITE("\033[38;5;15m"),
    ORANGE("\033[38;5;208m"),
    PINK("\033[38;5;204m"),
    RED("\033[38;5;196m"),
    GREEN("\033[38;5;46m"),
    GOLD("\033[38;5;214m"),
    BROWN("\033[38;5;130m"),
    YELLOW("\033[38;5;226m"),
    BLUE("\033[38;5;21m"),
    PURPLE("\033[38;5;129m"),
    LILAC("\033[38;5;207m"),
    CYAN("\033[38;5;51m"),
    GRAY("\033[38;5;246m");

    public final String code;

    Color(String code) {
        this.code = code;
    }

    public static String getRandomColor() {
        String color = "\033[38;5;";
        color += new Random().nextInt(233);
        color += "m";
        return color;
    }
}
