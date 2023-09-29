package sudak.printer;

import static java.lang.System.out;
import static sudak.printer.Color.getRandomColor;

/**
 * @author Yury Sudak
 */
public class LineBuilder {
    private final int length;

    public LineBuilder(int length) {
        this.length = length;
    }

    private void print(String colorCode, String element) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(element);
        }
        out.println(colorCode + sb + Color.RESET.code);
    }


    public void green(String element) {
        print(Color.GREEN.code, element);
    }

    public void blue(String element) {
        print(Color.BLUE.code, element);
    }

    public void white(String element) {
        print(Color.WHITE.code, element);
    }

    public void orange(String element) {
        print(Color.ORANGE.code, element);
    }

    public void red(String element) {
        print(Color.RED.code, element);
    }

    public void pink(String element) {
        print(Color.PINK.code, element);
    }

    public void yellow(String element) {
        print(Color.YELLOW.code, element);
    }

    public void gold(String element) {
        print(Color.GOLD.code, element);
    }

    public void purple(String element) {
        print(Color.BLUE.code, element);
    }

    public void lilac(String element) {
        print(Color.LILAC.code, element);
    }

    public void cyan(String element) {
        print(Color.CYAN.code, element);
    }

    public void gray(String element) {
        print(Color.GRAY.code, element);
    }

    public void brown(String element) {
        print(Color.BROWN.code, element);
    }

    public void random(String element) {
        print(getRandomColor(), element);
    }
}
