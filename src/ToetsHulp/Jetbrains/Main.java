package ToetsHulp.Jetbrains;

import java.util.Scanner;

class Main {
    static boolean keepRunning = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0;

        while (keepRunning) {
            int number = scanner.nextInt();
            if (number == 0) {
                keepRunning = false;
            } else {
                total += number;
            }
        }
        System.out.println(total);
    }


    //test
}
