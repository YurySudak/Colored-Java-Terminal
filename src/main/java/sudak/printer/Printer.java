package sudak.printer;

import static java.lang.System.out;

public class Printer {
    StringBuilder result;

    Printer() {
        result = new StringBuilder();
    }

    public Printer green(Object... s) {
        result.append(Print.GREEN).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer orange(Object... s) {
        result.append(Print.ORANGE).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer pink(Object... s) {
        result.append(Print.PINK).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer gold(Object... s) {
        result.append(Print.GOLD).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer lilac(Object... s) {
        result.append(Print.LILAC).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer blue(Object... s) {
        result.append(Print.BLUE).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer red(Object... s) {
        result.append(Print.RED).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer yellow(Object... s) {
        result.append(Print.YELLOW).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer white(Object... s) {
        result.append(Print.WHITE).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer purple(Object... s) {
        result.append(Print.PURPLE).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer cyan(Object... s) {
        result.append(Print.CYAN).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer gray(Object... s) {
        result.append(Print.GRAY).append(Print.aggregate(s)).append(" ");
        return this;
    }

    public Printer brown(Object... s) {
        result.append(Print.BROWN).append(Print.aggregate(s)).append(" ");
        return this;
    }


    public void build() {
        result.append(Print.RESET);
        out.println(result);
    }

}
