package sudak.printer;

import java.util.*;

import static java.lang.System.out;

/**
 * @author Yury Sudak
 */
public class Print {
    static final String RESET = "\033[0m";
    static final String WHITE = "\033[38;5;15m";
    static final String ORANGE = "\033[38;5;208m";
    static final String PINK = "\033[38;5;204m";
    static final String RED = "\033[38;5;196m";
    static final String GREEN = "\033[38;5;46m";
    static final String GOLD = "\033[38;5;214m";
    static final String BROWN = "\033[38;5;130m";
    static final String YELLOW = "\033[38;5;226m";
    static final String BLUE = "\033[38;5;21m";
    static final String PURPLE = "\033[38;5;129m";
    static final String LILAC = "\033[38;5;207m";
    static final String CYAN = "\033[38;5;51m";
    static final String GRAY = "\033[38;5;246m";


    public static Printer builder() {
        return new Printer();
    }

    public static ArrayPrinter array(Object o) {
        if (!o.getClass().isArray()) {
            throw new RuntimeException(o + " is not an array");
        }
        Object[] array;
        try {
            array = (Object[]) o;
        } catch (ClassCastException e) {
            Class<?> type = o.getClass().getComponentType();
            if (type.equals(int.class)) array = Arrays.stream((int[]) o).boxed().toArray(Object[]::new);
            else if (type.equals(long.class)) array = Arrays.stream((long[]) o).boxed().toArray(Object[]::new);
            else if (type.equals(double.class)) array = Arrays.stream((double[]) o).boxed().toArray(Object[]::new);
            else throw new RuntimeException(type + " component type is not supported! please, make primitives boxed");
        }
        return new ArrayPrinter(array);
    }

    static String aggregate(Object[] arr) {
        if (arr == null) return "null ";
        if (arr.length == 1) return arr[0].toString();
        StringBuilder sb = new StringBuilder();
        for (Object obj : arr) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString();
    }

    static String aggregateRandom(Object[] arr) {
        if (arr == null) return "null ";
        if (arr.length == 1) {
            return getRandomColor() + arr[0].toString() + RESET;
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : arr) {
            sb.append(getRandomColor()).append(obj.toString()).append(RESET).append(" ");
        }
        return sb.toString();
    }

    public static void white(Object... s) {
        out.println(WHITE + aggregate(s) + RESET);
    }
    public static void orange(Object... s) {
        out.println(ORANGE + aggregate(s) + RESET);
    }
    public static void red(Object... s) {
        out.println(RED + aggregate(s) + RESET);
    }
    public static void pink(Object... s) {
        out.println(PINK + aggregate(s) + RESET);
    }
    public static void green(Object... s) {
        out.println(GREEN + aggregate(s) + RESET);
    }
    public static void yellow(Object... s) {
        out.println(YELLOW + aggregate(s) + RESET);
    }
    public static void gold(Object... s) {
        out.println(GOLD + aggregate(s) + RESET);
    }
    public static void blue(Object... s) {
        out.println(BLUE + aggregate(s) + RESET);
    }
    public static void purple(Object... s) {
        out.println(PURPLE + aggregate(s) + RESET);
    }
    public static void lilac(Object... s) {
        out.println(LILAC + aggregate(s) + RESET);
    }
    public static void cyan(Object... s) {
        out.println(CYAN + aggregate(s) + RESET);
    }
    public static void gray(Object... s) {
        out.println(GRAY + aggregate(s) + RESET);
    }

    public static void brown(Object... s) {
        out.println(BROWN + aggregate(s) + RESET);
    }

    public static void random(Object... s) {
        out.println(getRandomColor() + aggregate(s) + RESET);
    }

    public static void randomAll(Object... s) {
        out.println(aggregateRandom(s));
    }

    static String getRandomColor() {
        String color = "\033[38;5;";
        color += new Random().nextInt(233);
        color += "m";
        return color;
    }

    public static void showColors() {
        Set<Integer> set = new HashSet<>(Arrays.asList(15, 51, 87, 123, 159, 195, 231, 254));
        for (int i = 0; i < 255; i++) {
            String number = String.valueOf(i);
            number = format(number);
            String s = "\033[38;5;" + i + "m" + number + " ";
            out.print(s);
            if (set.contains(i)) out.println();
        }
    }

    private static String format(String s) {
        int size = 3;
        int l = s.length();
        if (size <= l) return s;

        char[] temp = new char[size - l];
        Arrays.fill(temp, '0');
        return String.valueOf(temp) + s;
    }
}

class Printer {
    String result;

    Printer() {
        result = "";
    }

    public Printer green(Object... s) {
        result += Print.GREEN + Print.aggregate(s) + " ";
        return this;
    }

    public Printer orange(Object... s) {
        result += Print.ORANGE + Print.aggregate(s) + " ";
        return this;
    }

    public Printer pink(Object... s) {
        result += Print.PINK + Print.aggregate(s) + " ";
        return this;
    }

    public Printer gold(Object... s) {
        result += Print.GOLD + Print.aggregate(s) + " ";
        return this;
    }

    public Printer lilac(Object... s) {
        result += Print.LILAC + Print.aggregate(s) + " ";
        return this;
    }

    public Printer blue(Object... s) {
        result += Print.BLUE + Print.aggregate(s) + " ";
        return this;
    }

    public Printer red(Object... s) {
        result += Print.RED + Print.aggregate(s) + " ";
        return this;
    }

    public Printer yellow(Object... s) {
        result += Print.YELLOW + Print.aggregate(s) + " ";
        return this;
    }

    public Printer white(Object... s) {
        result += Print.WHITE + Print.aggregate(s) + " ";
        return this;
    }

    public Printer purple(Object... s) {
        result += Print.PURPLE + Print.aggregate(s) + " ";
        return this;
    }

    public Printer cyan(Object... s) {
        result += Print.CYAN + Print.aggregate(s) + " ";
        return this;
    }

    public Printer gray(Object... s) {
        result += Print.GRAY + Print.aggregate(s) + " ";
        return this;
    }

    public Printer brown(Object... s) {
        result += Print.BROWN + Print.aggregate(s) + " ";
        return this;
    }

    public void build() {
        result += Print.RESET;
        out.println(result);
    }

}

class ArrayPrinter {
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