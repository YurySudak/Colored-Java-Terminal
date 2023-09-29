package sudak.printer;

import java.util.*;

import static java.lang.System.out;

/**
 * @author Yury Sudak
 */
public class Print {

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
            return getRandomColor() + arr[0].toString() + Color.RESET.code;
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : arr) {
            sb.append(getRandomColor()).append(obj.toString()).append(Color.RESET.code).append(" ");
        }
        return sb.toString();
    }

    public static void white(Object... s) {
        out.println(Color.WHITE.code + aggregate(s) + Color.RESET.code);
    }
    public static void orange(Object... s) {
        out.println(Color.ORANGE.code + aggregate(s) + Color.RESET.code);
    }
    public static void red(Object... s) {
        out.println(Color.RED.code + aggregate(s) + Color.RESET.code);
    }
    public static void pink(Object... s) {
        out.println(Color.PINK.code + aggregate(s) + Color.RESET.code);
    }
    public static void green(Object... s) {
        out.println(Color.GREEN.code + aggregate(s) + Color.RESET.code);
    }
    public static void yellow(Object... s) {
        out.println(Color.YELLOW.code + aggregate(s) + Color.RESET.code);
    }
    public static void gold(Object... s) {
        out.println(Color.GOLD.code + aggregate(s) + Color.RESET.code);
    }
    public static void blue(Object... s) {
        out.println(Color.BLUE.code + aggregate(s) + Color.RESET.code);
    }
    public static void purple(Object... s) {
        out.println(Color.PURPLE.code + aggregate(s) + Color.RESET.code);
    }
    public static void lilac(Object... s) {
        out.println(Color.LILAC.code + aggregate(s) + Color.RESET.code);
    }
    public static void cyan(Object... s) {
        out.println(Color.CYAN.code + aggregate(s) + Color.RESET.code);
    }
    public static void gray(Object... s) {
        out.println(Color.GRAY.code + aggregate(s) + Color.RESET.code);
    }
    public static void brown(Object... s) {
        out.println(Color.BROWN.code + aggregate(s) + Color.RESET.code);
    }

    public static void random(Object... s) {
        out.println(getRandomColor() + aggregate(s) + Color.RESET.code);
    }
    public static void randomAll(Object... s) {
        out.println(aggregateRandom(s));
    }

    public static void blank() { out.println();}
    public static void blank(int n) {
        for (int i = 0; i < n; i++) {
            out.println();
        }}

    public static void line() {
        line(100, "*", Color.WHITE);
    }

    public static void line(int length, String element, Color color) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(element);
        }
        out.println(color.code + sb + Color.RESET.code);
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
