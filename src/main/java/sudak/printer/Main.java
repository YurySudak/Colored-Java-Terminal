package sudak.printer;

public class Main {

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
        System.out.println();

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
        System.out.println();


        // you can use default colors or try random color (233 colors)
        Print.random("this text is colored with random color");
        Print.random("this text is colored with random color");
        Print.random("this text is colored with random color");

        System.out.println();
        System.out.println();
    }

    private static void printLineWithDifferentColors() {
        Print.gold("=== LINES WITH DIFFERENT COLORS ===");
        // you can build colored line with defined colors
        Print.builder().blue("blue").green("green").yellow("yellow").build();
        System.out.println();

        // or with random colors
        Print.randomAll("all", "parts", "with", "random", "color");
        Print.randomAll("all", "parts", "with", "random", "color");
        Print.randomAll("all", "parts", "with", "random", "color");
        System.out.println();

        // peek available colors
        Print.builder().white("white").orange("orange").blue("blue").red("red").pink("pink").green("green").purple("purple")
                .gray("gray").yellow("yellow").gold("gold").cyan("cyan").lilac("lilac").brown("brown").build();
        System.out.println();
        System.out.println();
    }

    private static void printArrays() {
        Print.gold("=== ARRAYS ===");
        // you can print elements of array
        String[] arr = {"this", "is", "an", "array", "of", "strings"};
        Print.array(arr).blue();
        // array of strings can be printed as sentence
        Print.purple(arr);
        // even with random colors
        Print.randomAll(arr);
        Print.randomAll(arr);
        Print.randomAll(arr);
        System.out.println();

        // array of primitives accepted as well
        long[] l = {111L, 222L, 333L};
        Print.array(l).cyan();
        // if you need hashcode of array, don't use array() method
        Print.lilac(l);
        // you can print array with random color
        Print.array(l).random();
        Print.array(l).random();
        Print.array(l).random();
        // multidimansional array's elements prints as well
        int[][] i = {{1,2},{3,4}};
        Print.array(i).purple();
        byte[][][] b = {{{1,2,3},{4,5,6}},{{7,8},{9}},{{10}}};
        Print.array(b).brown();
        System.out.println();

        // available colors
        Print.array(new String[]{"this array is white"}).white();
        Print.array(new String[]{"this array is orange"}).orange();
        Print.array(new String[]{"this array is blue"}).blue();
        Print.array(new String[]{"this array is red"}).red();
        Print.array(new String[]{"this array is pink"}).pink();
        Print.array(new String[]{"this array is green"}).green();
        Print.array(new String[]{"this array is purple"}).purple();
        Print.array(new String[]{"this array is gray"}).gray();
        Print.array(new String[]{"this array is yellow"}).yellow();
        Print.array(new String[]{"this array is gold"}).gold();
        Print.array(new String[]{"this array is cyan"}).cyan();
        Print.array(new String[]{"this array is lilac"}).lilac();
        Print.array(new String[]{"this array is brown"}).brown();
        System.out.println();
        System.out.println();
    }

    private static void printColorPalette() {
        Print.gold("=== COLOR PALETTE ===");
        Print.showColors();
    }
}
