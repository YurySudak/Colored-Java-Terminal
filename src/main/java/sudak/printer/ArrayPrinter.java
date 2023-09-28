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
        out.println(Print.WHITE + result + Print.RESET);
    }
    public void blue() {
        out.println(Print.BLUE + result + Print.RESET);
    }
    public void pink() {
        out.println(Print.PINK + result + Print.RESET);
    }
    public void gold() {
        out.println(Print.GOLD + result + Print.RESET);
    }
    public void lilac() {
        out.println(Print.LILAC + result + Print.RESET);
    }
    public void orange() {
        out.println(Print.ORANGE + result + Print.RESET);
    }
    public void red() {
        out.println(Print.RED + result + Print.RESET);
    }
    public void green() {
        out.println(Print.GREEN + result + Print.RESET);
    }
    public void yellow() {
        out.println(Print.YELLOW + result + Print.RESET);
    }
    public void purple() {
        out.println(Print.PURPLE + result + Print.RESET);
    }
    public void cyan() {
        out.println(Print.CYAN + result + Print.RESET);
    }
    public void gray() {
        out.println(Print.GRAY + result + Print.RESET);
    }
    public void brown() {
        out.println(Print.BROWN + result + Print.RESET);
    }
    public void random() {
        out.println(Print.getRandomColor() + result + Print.RESET);
    }
}
