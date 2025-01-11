import java.util.Scanner;
public class userInput {
      public static void main(String[] args) {
      // Top take input from the user, we need to import the Scanner class
      // The Scanner class is a part of java.util package
      // To import Scanner class, on the top of the file, we need to write import java.util.Scanner;
      // The Scanner class is used to get user input, and it is created by passing System.in as a parameter
      // Make object of import Scanner

      Scanner scanner = new Scanner(System.in);
      // with the object of Scanner class, we can use the following methods to get user input

      // nextInt() - Reads an integer value from the user
      // nextFloat() - Reads a float value from the user
      // nextDouble() - Reads a double value from the user
      // next() - Reads a string value from the user
      // nextLine() - Reads a line of text from the user
      // nextBoolean() - Reads a boolean value from the user
      // nextByte() - Reads a byte value from the user
      // nextShort() - Reads a short value from the user
      // nextLong() - Reads a long value from the user

      // Example: Reading an integer value from the user
      System.out.println("Enter an your roll: ");
      int roll = scanner.nextInt();
      System.out.println("Roll added: " + roll);

      // Example: Reading a boolean value from the user 
      System.out.println("Are you over 18? (true/false): ");
      System.out.println("you are over 18: " + scanner.nextBoolean());

      scanner.nextLine(); // This is used to clear the buffer

      // Example: Reading a string value from the user
      System.out.println("Enter your name: ");
      String name = scanner.nextLine(); // nextLine() method is used to read a string value from the user
      System.out.println("Your name is: " + name); // Display the name entered by the user

      scanner.close(); // Close the scanner object to avoid memory leak
  }
}