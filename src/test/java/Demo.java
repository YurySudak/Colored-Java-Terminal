import sudak.printer.Print;

/**
 * @author Yury Sudak
 */
public class Demo {

    public static void main(String[] args) {
        printGeneralCases();
        printLineWithDifferentColors();
        printArrays();
        printColorPalette();
    }

    private static void printGeneralCases() {
        Print.gold("=== GENERAL CASES ===");
        int x = 5, y = 7;
        // instead of pluses:
        System.out.println("x = " + x + " y = " + y);
        // use commas
        Print.green("x =", x, "y =", y);
        Print.blank();

        // find out available colors
        Print.white("white");
        Print.orange("orange");
        Print.blue("blue");
        Print.red("red");
        Print.pink("pink");
        Print.green("green");
        Print.purple("purple");
        Print.gray("gray");
        Print.yellow("yellow");
        Print.gold("gold");
        Print.cyan("cyan");
        Print.lilac("lilac");
        Print.brown("brown");
        // blank line
        Print.blank();

        // you can use default colors or try random color (233 colors)
        Print.random("this text is colored with random color (233 colors)");
        Print.random("this text is colored with random color (233 colors)");
        Print.random("this text is colored with random color (233 colors)");

        // draw the line
        Print.line(70).blue("*");
        // blank 2 lines
        Print.blank(2);
    }

    private static void printLineWithDifferentColors() {
        Print.gold("=== LINES WITH DIFFERENT COLORS ===");
        // you can build colored line with defined colors
        Print.builder().blue("blue").green("green").yellow("yellow").build();
        Print.blank();

        // or with random colors
        Print.randomAll("all", "parts", "with", "random", "color");
        Print.randomAll("all", "parts", "with", "random", "color");
        Print.randomAll("all", "parts", "with", "random", "color");
        Print.blank();

        // line with all available colors
        Print.builder().white("white").orange("orange").blue("blue").red("red").pink("pink").green("green").purple("purple")
                .gray("gray").yellow("yellow").gold("gold").cyan("cyan").lilac("lilac").brown("brown").build();

        Print.line(100).green("=");
        Print.blank(2);
    }

    private static void printArrays() {
        Print.gold("=== ARRAYS ===");
        // you can print elements of array
        String[] arr = {"this", "is", "an", "array", "of", "strings"};
        Print.blue(arr);
        Print.green((Object) arr);
        Print.lilac("array", arr);
        Print.blank();

        // with random colors
        Print.randomAll(arr);
        Print.randomAll(arr);
        Print.randomAll(arr);
        Print.blank();

        // with data object
        User user1 = new User(1, "Yury", "yury@email.com");
        User user2 = new User(2, "Nata", "nata@email.com");
        Print.random("user1", user1);
        Print.random("user1", user1);
        Print.randomAll("user2", user2);
        Print.randomAll("user2", user2);
        Print.random(user1, user2);
        Print.randomAll(user1, user2);
        User[] users = new User[]{user1, user2};
        Print.randomAll(users);
        Print.randomAll("array of data objects", users);
        Print.blank();

        // array of primitives accepted as well
        long[] longs = {111L, 222L, 333L};
        Print.cyan(longs);
        // you can print array with random color
        Print.random(longs);
        Print.random(longs);
        Print.random(longs);
        Print.blank();

        // multidimensional array's elements prints as well
        int[][] ints = {{1,2},{3,4}};
        Print.purple(ints);
        Print.cyan(ints);
        Print.blank();

        byte[][][] bytes = {{{1,2,3},{4,5,6}},{{7,8},{9}},{{10}}};
        Print.brown(bytes);
        Print.random(bytes);
        Print.randomAll(bytes);
        Print.blank();

        Print.lilac("this is multidimensional arrays", ints, bytes);
        Print.random("this is multidimensional arrays", ints, bytes);
        Print.randomAll("this is multidimensional arrays", ints, bytes);

        Print.line(100).cyan("-");
        Print.blank(2);
    }

    private static void printColorPalette() {
        Print.gold("=== COLOR PALETTE (233 colors) ===");
        Print.showColors();
        Print.line(150).random("~");
    }
}
