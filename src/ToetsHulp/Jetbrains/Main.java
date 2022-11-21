package ToetsHulp.Jetbrains;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int input = scanner.nextInt();
        String compare = String.valueOf(input);
        String char1 = String.valueOf(compare.charAt(0));
        String char2 = String.valueOf(compare.charAt(compare.length() - 1));
        int result = Integer.parseInt(char1.concat(char2));
        System.out.println(input % result == 0);
    }
}
