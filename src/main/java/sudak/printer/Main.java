package sudak.printer;

public class Main {

    public static void main(String[] args) {
        printGeneralCases();
        Print.random("\n\n\n");

        printLineWithDifferentColors();
        Print.random("\n\n\n");

        printArrays();
        Print.random("\n\n\n");

        // print color palette
        Print.showColors();
    }

    private static void printGeneralCases() {
        int x = 5, y = 7;
        // instead of pluses:
        System.out.println("x = " + x + " y = " + y);
        // use commas
        Print.green("x =", x, "y =", y);

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


        // you can use default colors or try random color (233 colors)
        Print.random("this text is colored with random color");
    }

    private static void printLineWithDifferentColors() {
        // you can build colored line with defined colors
        Print.builder().blue("blue").green("green").yellow("yellow").build();
        // or with random colors
        Print.randomAll("all", "parts", "with", "random", "color");

        // peek available colors
        Print.builder().white("white").orange("orange").blue("blue").red("red").pink("pink").green("green").purple("purple")
                .gray("gray").yellow("yellow").gold("gold").cyan("cyan").lilac("lilac").brown("brown").build();
    }

    private static void printArrays() {
        // you can print elements of array
        String[] arr = {"this", "is", "an", "array", "of", "Strings"};
        Print.random(arr);
        Print.array(arr).blue();
        long[] l = {1L, 222222L, 3333333333333333L};
        // id you need hashcode of array, don't use array()
        Print.random(l);
        // you can print array with random color as well
        Print.array(l).random();
        // multidimansional array's elements prints as well
        int[][] i = {{1,2},{3,4}};
        Print.array(i).purple();

        // peek available colors
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
    }
}