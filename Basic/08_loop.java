public class loop {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    // pre fix increment, unary operator in front
    System.out.println("Prefix");
    // System.out.println(++num1); // 11
    // System.out.println(num1); // 11
    
    // post fix increment, unary operator in back
    System.out.println("Postfix");
    System.out.println(num1++);
    System.out.println(num1);

    //  // pre fix Decrement, unary operator in front
    System.out.println(--num2); // 19
    System.out.println(num2); // 19

    for (int i = 0; i <= 5; i++){
      System.out.println("Loop"+ i);
    }

    for(int idx = 5 ; idx >= 0 ; idx-- ){
      System.out.println("Decrement" + idx);
    }

    for(int var = 5; var >= -1; var--){
      System.out.println(var); // 5 to -1
    };

    Nested Loop 
    for(int row = 1 ; row < 6 ; row ++){
      System.out.println("Outer Loop .." + row);
      for(int col = 5 ; col > 1 ; col --){
        System.out.println("Inner Loop" + col);
      };
      System.out.println("Inner loop Exit"); // print every time when inner loop executed.
    };
    System.out.println("Outer loop Exit"); // print only once after outer loop is executed

  // QUE: Task1 using for loop print table 
  // 2 x 1 = 2
  // 2 x 2 = 4
  // ....
  // 2 x 10 = 20

  // use 2 x variable to achieve this

  for (int i = 1; i <= 10; i++){
    System.out.println("2 x "+ i + " = " + i*2);
  };
  System.out.println("Stop The Table");


  // QUE: Task2 (HW)
  // Task 2 (HW)
// Using nested loop
// print the table
// Multiplication of 1
// 1 x 1 = 1
// ...
// 1 x 20 = 20
// MUltiplication of 10
// 10 x 1 = 10
// 10 x 20 =  200

  };

};
