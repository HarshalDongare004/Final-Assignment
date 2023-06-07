import java.util.*;

public class SecondLargestAndSecondSmallest {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a set of integers.
        System.out.println("Enter a set of integers: ");

        // Read the integers from the user and store them in a List.
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Find the second largest and second smallest elements in the List.
        Collections.sort(numbers);
        int secondLargest = numbers.get(numbers.size() - 2);
        int secondSmallest = numbers.get(1);

        // Print the second largest and second smallest elements in the List.
        System.out.println("The second largest element is: " + secondLargest);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}