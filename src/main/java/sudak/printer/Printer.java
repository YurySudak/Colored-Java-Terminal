package sudak.printer;

import static java.lang.System.out;

public class Printer {
    StringBuilder result;

    Printer() {
        result = new StringBuilder();
    }

    public Printer green(Object... s) {
        result.append(Color.GREEN.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer orange(Object... s) {
        result.append(Color.ORANGE.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer pink(Object... s) {
        result.append(Color.PINK.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer gold(Object... s) {
        result.append(Color.GOLD.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer lilac(Object... s) {
        result.append(Color.LILAC.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer blue(Object... s) {
        result.append(Color.BLUE.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer red(Object... s) {
        result.append(Color.RED.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer yellow(Object... s) {
        result.append(Color.YELLOW.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer white(Object... s) {
        result.append(Color.WHITE.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer purple(Object... s) {
        result.append(Color.PURPLE.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer cyan(Object... s) {
        result.append(Color.CYAN.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer gray(Object... s) {
        result.append(Color.GRAY.code).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer brown(Object... s) {
        result.append(Color.BROWN.code).append(Print.aggregate(s)).append(" ");
        return this;
    }


    public void build() {
        result.append(Color.RESET.code);
        out.println(result);
    }

}
