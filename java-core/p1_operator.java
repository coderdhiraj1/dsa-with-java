public static  void  main(String[] args){
    int a = 10, b = 5;

    // Arithmetic Operators
    System.out.println("Addition : " + (a+b));
    System.out.println("Subtraction : " + (a-b));
    System.out.println("Divide : " + (a/b));
    System.out.println("Multiply : " + (a*b));
    System.out.println("Modulus : " + (a%b));

    // Relational (Comparison) Operators
    System.out.println("a == b : " + (a == b));   // false
    System.out.println("a != b : " + (a != b));   // true
    System.out.println("a >  b : " + (a >  b));   // true
    System.out.println("a <  b : " + (a <  b));   // false
    System.out.println("a >= b : " + (a >= b));   // true
    System.out.println("a <= b : " + (a <= b));   // false

    // Logical operator
    boolean x = true, y = false;

    System.out.println("x && y : " + (x && y));   // false (AND)
    System.out.println("x || y : " + (x || y));   // true  (OR)
    System.out.println("!x     : " + (!x));        // false (NOT)

    // Assignment operator
    int n = 10;

    n += 5;   System.out.println("+=  : " + n);   // 15
    n -= 3;   System.out.println("-=  : " + n);   // 12
    n *= 2;   System.out.println("*=  : " + n);   // 24
    n /= 4;   System.out.println("/=  : " + n);   // 6
    n %= 4;   System.out.println("%=  : " + n);   // 2

    // Increment & Decrement Operators

    int c = 5;

    System.out.println("c++  : " + c++);   // 5 (use then increase)
    System.out.println("after: " + c);     // 6
    System.out.println("++c  : " + ++c);   // 7 (increase then use)
    System.out.println("c--  : " + c--);   // 7 (use then decrease)
    System.out.println("after: " + c);     // 6
    System.out.println("--c  : " + --c);   // 5 (decrease then use)




}

