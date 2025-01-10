public class operatorExample {
  
  public static void main(String[] args) {
    // QUE: Arithmetic Operators
    // +, -, *, /, %
    
    int intVariable1 = 10, intVariable2 = 20; // Declaring two integer variables
    int addResult = intVariable1 + intVariable2; // 10 + 20 Adding two integer variables and storing the result in addResult
    int subResult = intVariable1 - intVariable2; // 10 - 20 Subtracting two integer variables and storing the result in subResult
    int mulResult = intVariable1 * intVariable2; // 10 * 20 Multiplying two integer variables and storing the result in mulResult
    int divResult = intVariable1 / intVariable2; // 10 / 20 Dividing two integer variables and storing the result in divResult
    float divResultFloat = (float)intVariable1 / intVariable2; // 10 / 20 Dividing two integer variables and storing the result in divResultFloat
    int modResult = intVariable1 % intVariable2; // 10 % 20 Modulus of two integer variables and storing the result in modResult

    System.out.println("Addition Result: " + addResult); // 30
    System.out.println("Subtraction Result: " + subResult); // -10
    System.err.println("Multiplication Result: " + mulResult); // 200
    System.out.println("Division Result: " + divResult); // 0
    System.out.println("Division Result Float: " + divResultFloat); // 0.5
    System.out.println("Modulus Result: " + modResult); // 10

    // QUE: Assignment Operators
    // =, +=, -=, *=, /=, %=

    int equalAssignment = 200; // Declaring an integer variable
    equalAssignment += 100; // equalAssignment = equalAssignment + 100 (200 + 100 = 300)
    equalAssignment -= 100; // equalAssignment = equalAssignment - 100 (300 - 100 = 200)
    equalAssignment *= 100; // equalAssignment = equalAssignment * 100 (200 * 100 = 20000)
    equalAssignment /= 100; // equalAssignment = equalAssignment / 100 (20000 / 100 = 200 )
    equalAssignment %= 100; // equalAssignment = equalAssignment % 100 (200 % 100 = 0)

    // QUE: Relational Operators
    // ==, !=, >, <, >=, <=

    boolean lessThan = 10 < 2; // 10 < 2 (false)
    boolean greaterThan = 10 > 2; // 10 > 2 (true)
    boolean lessThanEqualTo = 10 <= 2; // 10 <= 2 (false)
    boolean greaterThanEqualTo = 10 >= 2; // 10 >= 2 (true)
    boolean equalTo = 10 == 2; // 10 == 2 (false)
    boolean equalTo2 = 10 == 10; // 10 == 10 (true)
    boolean notEqualTo = 10 != 2; // 10 != 2 (true)

    // QUE: Logical Operators
    // &&, ||, !

    boolean andOperator = (10 > 2) && (10 < 20); // (10 > 2) && (10 < 20) (true && true = true)
    boolean orOperator = (10 > 2) || (10 < 20); // (10 > 2) || (10 < 20) (true || true = true)
    boolean notOperator = !(10 > 2); // !(10 > 2) (!true = false)
    boolean andOperator2 = (10 > 2) && (10 < 5); // (10 > 2) && (10 < 5) (true && false = false)
    boolean orOperator2 = (10 > 2) || (10 < 5); // (10 > 2) || (10 < 5) (true || false = true)
    boolean notOperator2 = !(10 < 2); // !(10 < 2) (!false = true)

    // QUE: unary Operators
    // ++, --

    int intVariable3 = 10; // Declaring an integer variable
    intVariable3++; // intVariable3 = intVariable3 + 1 (10 + 1 = 11)
    intVariable3--; // intVariable3 = intVariable3 - 1 (11 - 1 = 10)
    
    // NOTE:
    // intVariable3++ is post increment
    // ++intVariable3 is pre increment
    // operator on one variable is unary operator

    // QUE: Bitwise Operators
    // &, |, ^, ~, <<, >>

    int intVariable4 = 10, intVariable5 = 20; // Declaring two integer variables
    int andOperatorBitwise = intVariable4 & intVariable5; // 10 & 20 (0000 1010 & 0001 0100 = 0000 0000)
    int operatorBitwise = intVariable4 | intVariable5; // 10 | 20 (0000 1010 | 0001 0100 = 0001 1110)
    int xorOperatorBitwise = intVariable4 ^ intVariable5; // 10 ^ 20 (0000 1010 ^ 0001 0100 = 0001 1110)
    int notOperatorBitwise = ~intVariable4; // ~10 (~0000 1010 = 1111 0101)
    int leftShiftOperator = intVariable4 << 2; // 10 << 2 (0000 1010 << 2 = 0010 1000)
    int rightShiftOperator = intVariable4 >> 2; // 10 >> 2 (0000 1010 >> 2 = 0000 0010)

  }
}

// Thank you!!