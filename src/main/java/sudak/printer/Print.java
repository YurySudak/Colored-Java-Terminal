package sudak.printer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;
import static sudak.printer.Color.getRandomColor;

/**
 * @author Yury Sudak
 */
public class Print {

    public static PrintBuilder builder() {
        return new PrintBuilder();
    }

    private static String arrayToString(Object o) {
        Object[] array;
        try {
            array = (Object[]) o;
        } catch (ClassCastException e) {
            Class<?> type = o.getClass().getComponentType();
            if (type.equals(int.class)) array = Arrays.stream((int[]) o).boxed().toArray(Integer[]::new);
            else if (type.equals(long.class)) array = Arrays.stream((long[]) o).boxed().toArray(Long[]::new);
            else if (type.equals(double.class)) array = Arrays.stream((double[]) o).boxed().toArray(Double[]::new);
            else throw new RuntimeException(type + " component type is not supported! please, make primitives boxed, e.g. float -> Float");
        }
        if (array[0].getClass().isArray()) {
            return Arrays.deepToString(array);
        } else {
            return Arrays.toString(array);
        }
    }

    static String aggregate(Object[] arr, boolean random) {
        if (arr == null) return "null ";
        StringBuilder sb = new StringBuilder();
        for (Object obj : arr) {
            if (obj.getClass().isArray()) {
                obj = arrayToString(obj);
            }
            if (random) {
                sb.append(getRandomColor()).append(obj.toString()).append(Color.RESET.code).append(" ");
            } else {
                sb.append(obj).append(" ");
            }
        }
        return sb.toString();
    }

    private static void print(String colorCode, Object[] arr) {
        out.println(colorCode + aggregate(arr, false) + Color.RESET.code);
    }

    public static void white(Object... s) {
        print(Color.WHITE.code, s);
    }

    public static void orange(Object... s) {
        print(Color.ORANGE.code, s);
    }

    public static void red(Object... s) {
        print(Color.RED.code, s);
    }

    public static void pink(Object... s) {
        print(Color.PINK.code, s);
    }

    public static void green(Object... s) {
        print(Color.GREEN.code, s);
    }

    public static void yellow(Object... s) {
        print(Color.YELLOW.code, s);
    }

    public static void gold(Object... s) {
        print(Color.GOLD.code, s);
    }

    public static void blue(Object... s) {
        print(Color.BLUE.code, s);
    }

    public static void purple(Object... s) {
        print(Color.PURPLE.code, s);
    }

    public static void lilac(Object... s) {
        print(Color.LILAC.code, s);
    }

    public static void cyan(Object... s) {
        print(Color.CYAN.code, s);
    }

    public static void gray(Object... s) {
        print(Color.GRAY.code, s);
    }

    public static void brown(Object... s) {
        print(Color.BROWN.code, s);
    }

    public static void random(Object... s) {
        print(getRandomColor(), s);
    }

    public static void randomAll(Object... s) {
        out.println(aggregate(s, true));
    }

    public static void blank() {
        out.println();
    }

    public static void blank(int n) {
        for (int i = 0; i < n; i++) {
            out.println();
        }
    }

    public static LineBuilder line(int length) {
        return new LineBuilder(length);
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
        int n = 3;
        int l = s.length();
        if (n <= l) return s;
        char[] temp = new char[n - l];
        Arrays.fill(temp, '0');
        return String.valueOf(temp) + s;
    }
}
