package Basic;
public class variableExample {
  // Instance variable  
  int InstanceVariable = 100;
  // Instance Variable can only be accessed by creating objects

  // Static variable
  static boolean staticVariable = true;
  // local variable can be only accessed within the method(Function)

  public void method() {
    int localVariable = 200;
    System.out.println("Local Variable: " + localVariable); // Output: 
  }

  public static void main(String[] args) {
    // To make an object of the class, class name is the dayta type
    // to initialize the object, "new" keyword is used and ends with semicolon ();

    variableExample  variableExampleObj = new variableExample();
    // #NOTE:
    variableExampleObj.InstanceVariable = 200;
    
    // using instance variable through object obj
    System.out.println("Instance Variable: " + variableExampleObj.InstanceVariable); // Output: 100
    //using static variable through class name directly
    System.out.println("Static Variable: " + variableExample.staticVariable); // Output: true

    // Creating another object of the class
    variableExample variableExampleOhj2 = new variableExample(); 
    System.out.println("Instance Variable2: " + variableExampleOhj2.InstanceVariable); // Output: 100
    variableExample.staticVariable = false;
    System.out.println("Static Variable: " + variableExample.staticVariable); // Output: false


    // primive data types casting
    // Widening Casting / Implicit Casting(Autumaticaly done by Java)
    // Small size/capacity data type to large size/capacity data type
    // byte -> short -> char -> int -> long -> float -> double
    byte byteVar = 100;
    short doubleVariableOne = byteVar; // byte is automatically converted to short data type
    System.out.println("byteVar converted to short: " + doubleVariableOne); // Output: 100

    int intVariable = 40;
    double doubleVariableTwo = intVariable; // int is automatically converted to double data type
    System.out.println("intVariable converted to double: " + doubleVariableTwo); // Output: 40.0

    // Narrowing Casting / Explicit Casting(Manually done by the programmer)
    // Large size/capacity data type to small size/capacity data type
    float mathMark = 100.0f;
    int intMathMark = (int) mathMark; // float is manually converted to int data type
    System.out.println("mathMark converted to int: " + intMathMark); // Output: 100

    int intScienceMark = (int) 70.44f; // float is manually converted to int data type
    System.out.println("70.44f converted to int: " + intScienceMark); // Output: 70


    // Type Conversion in Expressions
    // The division of two integers in Java results in an integer.
    float floatCalculationOne = 1/2;
    System.out.println("1/2: " + floatCalculationOne); // Output: 0.0

    // The division of two integers in Java results in an integer. To get a float result, one of the operands should be a float.
    float floatCalculation = 1.0f/2; // 0.5
    System.out.println("1/2: " + floatCalculation); // Output: 0.5


// QUE: create the following calculation
      /*
         * float var = 4/5;
         * double var = 100/3;
         * convert int to double
         * int var = 49;
         */
// ANS:
float floatVar = 4.0f / 5; // Ensure floating-point division
System.out.println("4/5 as float: " + floatVar); // Output: 0.8

double doubleVar = 100.0 / 3; // Ensure floating-point division
System.out.println("100/3 as double: " + doubleVar); // Output: 33.333333333333336

// Convert int to double
int intVar = 49;
double convertedDouble = intVar; // Implicit casting from int to double
System.out.println("int 49 converted to double: " + convertedDouble); // Output: 49.0

  }

}
