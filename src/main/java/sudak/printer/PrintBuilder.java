package sudak.printer;

import static java.lang.System.out;
import static sudak.printer.Print.aggregate;

/**
 * @author Yury Sudak
 */
public class PrintBuilder {
    private StringBuilder result;

    PrintBuilder() {
        result = new StringBuilder();
    }

    private PrintBuilder add(Object[] arr, Color color) {
        result.append(color.code).append(aggregate(arr, false)).append(" ");
        return this;
    }

    public PrintBuilder green(Object... s) {
        return add(s, Color.GREEN);
    }

    public PrintBuilder orange(Object... s) {
        return add(s, Color.ORANGE);
    }

    public PrintBuilder pink(Object... s) {
        return add(s, Color.PINK);
    }

    public PrintBuilder gold(Object... s) {
        return add(s, Color.GOLD);
    }

    public PrintBuilder lilac(Object... s) {
        return add(s, Color.LILAC);
    }

    public PrintBuilder blue(Object... s) {
        return add(s, Color.BLUE);
    }

    public PrintBuilder red(Object... s) {
        return add(s, Color.RED);
    }

    public PrintBuilder yellow(Object... s) {
        return add(s, Color.YELLOW);
    }

    public PrintBuilder white(Object... s) {
        return add(s, Color.WHITE);
    }

    public PrintBuilder purple(Object... s) {
        return add(s, Color.PURPLE);
    }

    public PrintBuilder cyan(Object... s) {
        return add(s, Color.CYAN);
    }

    public PrintBuilder gray(Object... s) {
        return add(s, Color.GRAY);
    }

    public PrintBuilder brown(Object... s) {
        return add(s, Color.BROWN);
    }


    public void build() {
        result.append(Color.RESET.code);
        out.println(result);
    }

}
