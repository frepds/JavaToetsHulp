package ToetsHulp.Jetbrains;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main1 {
    static boolean keepRunning = true;
    static Scanner scanner = new Scanner(System.in);
    static int[] array;
    static int index = 0, total = 0;

    public static void main(String[] args) {
        System.out.println("Enter total amount numbers: ");
        int length = scanner.nextInt();
        array = new int[length];

        System.out.println("Enter numbers: ");
        while (keepRunning) {
            try {
                int number = scanner.nextInt();
                if (number == 0) {
                    keepRunning = false;
                } else {
                    total += number;
                    array[index] = number;
                    index++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a 'Number'!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array full!");
                keepRunning = false;
            }
        }

        System.out.println("Total : " + total + " \n" + Arrays.toString(array));
    }
}
