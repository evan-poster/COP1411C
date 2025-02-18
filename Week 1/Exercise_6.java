// 1.3.15

/**
 * Write a Queue client that takes a command-line argument k and prints the kth from the last string found on standard input (assuming that standard input has k or more strings).
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a value for k as a command-line argument.");
            return;
        }

        int k = Integer.parseInt(args[0]);
        Queue<String> queue = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter strings (one per line). Enter an empty line to finish input:");

        String line;
        while (!(line = input.nextLine()).isEmpty()) {
            queue.add(line);
        }

        if (queue.size() < k) {
            System.out.println("Not enough strings entered. The queue contains fewer than " + k + " strings.");
            return;
        }

        // Remove elements until we reach the kth from last
        while (queue.size() > k) {
            queue.remove();
        }

        System.out.println("The " + k + "th string from the last is: " + queue.peek());
    }
}
