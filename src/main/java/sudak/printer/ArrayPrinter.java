package sudak.printer;

import java.util.Arrays;

import static java.lang.System.out;

public class ArrayPrinter {
    String result;

    public ArrayPrinter(Object[] arr) {
        if (arr == null) {
            result = "null";
            return;
        }
        if (arr.length == 0) {
            result = "[]";
            return;
        }
        if (arr[0].getClass().isArray()) {
            result = Arrays.deepToString(arr);
        } else {
            result = Arrays.toString(arr);
        }
    }

    public void white() {
        out.println(Color.WHITE.code + result + Color.RESET.code);
    }
    public void blue() {
        out.println(Color.BLUE.code + result + Color.RESET.code);
    }
    public void pink() {
        out.println(Color.PINK.code + result + Color.RESET.code);
    }
    public void gold() {
        out.println(Color.GOLD.code + result + Color.RESET.code);
    }
    public void lilac() {
        out.println(Color.LILAC.code + result + Color.RESET.code);
    }
    public void orange() {
        out.println(Color.ORANGE.code + result + Color.RESET.code);
    }
    public void red() {
        out.println(Color.RED.code + result + Color.RESET.code);
    }
    public void green() {
        out.println(Color.GREEN.code + result + Color.RESET.code);
    }
    public void yellow() {
        out.println(Color.YELLOW.code + result + Color.RESET.code);
    }
    public void purple() {
        out.println(Color.PURPLE.code + result + Color.RESET.code);
    }
    public void cyan() {
        out.println(Color.CYAN.code + result + Color.RESET.code);
    }
    public void gray() {
        out.println(Color.GRAY.code + result + Color.RESET.code);
    }
    public void brown() {
        out.println(Color.BROWN.code + result + Color.RESET.code);
    }
    public void random() {
        out.println(Print.getRandomColor() + result + Color.RESET.code);
    }
}
