package zender.printer;

public class Main {

    public static void main(String[] args) {
        int x = 5, y = 7;
        // instead of pluses:
        // System.out.println("x = " + x + " y = " + y);
        // use commas
        Print.green("x =", x, "y =", y);
        // you can choose another color: blue, red, white, purple, yellow, cian, gray
        // or try random color
        Print.random("this text is colored with random color");
        // you can build colored line with defined colors
        Print.builder().blue("blue").green("green").yellow("yellow").build();
        // or with random colors
        Print.randomAll("all", "parts", "with", "random", "color");
        // you can print elements of array
        String[] arr = {"this", "is", "an", "array", "of", "Strings"};
        Print.array(arr).blue();
        long[] l = {1L, 222222L, 3333333333333333L};
        Print.array(l).random();
        // even multidimansional array
        int[][] i = {{1,2},{3,4}};
        Print.array(i).purple();
    }
}
