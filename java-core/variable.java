public static  void main(String[] args){

    // 8-bit integer (-128 to 127)
    byte myByte = 100;

    // 16-bit integer (-32,768 to 32,767)
    short myShort = 32000;

    // 32-bit integer (-2^31 to 2^31 - 1)
    int myInt = 203939;

    // 64-bit integer (-2^63 to 2^63 - 1); L notation as suffix to represent
    long myLong = 3939392222L;

    // 32-bit floating point; F in suffix
    float myFloat = 3.14F;

    // 64-bit floating point; more precise
    double myDouble = 3.141234567890;

    // char - single 16 bit Unicode character; Single quote always
    char myChar = 'A';

    // boolean - true/false
    boolean myBool = true;

    // String - Reference type; Need double quote always
    String myString = "Text";

    System.out.println("----Basic Java Variables------");
    System.out.println("byte :" + myByte);
    System.out.println("short :" + myShort);
    System.out.println("int :" + myInt);
    System.out.println("long :" + myLong);
    System.out.println("float :" + myFloat);
    System.out.println("double :" + myDouble);
    System.out.println("char :" + myChar);
    System.out.println("bool :" + myBool);
    System.out.println("string :" + myString);


    System.out.println("----Max and Min Values------");
    System.out.println("Byte Min: " + Byte.MIN_VALUE + " Max: " + Byte.MAX_VALUE);
    System.out.println("Short Min: " + Short.MIN_VALUE + " Max: " + Short.MAX_VALUE);
    System.out.println("Int Min: " + Integer.MIN_VALUE + " Max: " + Integer.MAX_VALUE);
    System.out.println("Long Min: " + Long.MIN_VALUE + " Max: " + Long.MAX_VALUE);
    System.out.println("Float Min: " + Float.MIN_VALUE + " Max: " + Float.MAX_VALUE);
    System.out.println("Double Min: " + Double.MIN_VALUE + " Max: " + Double.MAX_VALUE);
    System.out.println("Char Min: " + Character.MIN_VALUE + " Max: " + Character.MAX_VALUE);
    // not needed for boolean type
    //for string also not needed because its a primitive type


    System.out.println("Length of a given string is: "+myString.length());
}