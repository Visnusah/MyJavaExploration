//QUE: UserOutput 
public class userOutput {
  public static void main(String[] args) {
    // NOTE: Ternaly Operator

    // int marking1 = 40;
    // int marking2 = 50;
    // String status;
    // if (marking1 > 30 && marking2 > 30) {
    //   status = "pass";
    // } else {
    //   status = "fail";
    // }

    int marking1 = 40;
    int marking2 = 50;
    String status = (marking1 > 30 && marking2 > 30) ? "pass" : "fail";
    System.out.println("Status: " + status);   
    
    // QUE: What is the difference between System.out.println(), System.out.print() and System.out.printf() in Java?
    // System.out.println() is used to display output on the screen with a newline character
    System.out.println("Using System.out.println() to display output on the screen with a newline character");
    System.out.println("Hello World");

    // System.out.print() is used to display output on the screen without a newline character
    System.out.print("Using System.out.print() to display output on the screen without a newline character");
    System.out.print("Hello");
    System.out.print("World");
    System.out.print("\nWorld"); // \n is used to print a newline character

    // System.out.printf() is used to display formatted output on the screen
    System.out.printf("Using System.out.printf() to display formatted output on the screen");
    // %f, %d, %s are format specifiers
    // %f -> float or double, %d -> integer, %s -> string(any data type)
    System.out.printf("Hello %s, your marks are %d", "Kamlesh", 90);
    System.out.printf("Name: %s, Age: %d, Weight: %f", "Kamlesh", 20, 57.4);
    // The formatter must match the pattern of the data type (remaing arguments)
    // The arguments %s than %d than %f means the first argument is string, the second argument is integer and the third argument is float

  }
}