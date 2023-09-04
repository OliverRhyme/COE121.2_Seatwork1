package problem2;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        InfiniteArray<Integer> array = new InfiniteArray<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
           String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            array.add(Integer.parseInt(input));
        }

        System.out.println("Size: " + array.getSize());
        System.out.println("Array: " + array);
    }
}

