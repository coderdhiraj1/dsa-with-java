void main(String[] args) {
    int age = 20;

    // if statement
    if(age>=18) {
        System.out.println("Adult");
    }

    // if-else statement
    if(age>=18){
        System.out.println("Adult");
    } else {
        System.out.println("Child");
    }


    // ladder if else
    int marks = 75;
    if (marks >= 90) {
        System.out.println("Grade : A");
    } else if (marks >= 80) {
        System.out.println("Grade : B");
    } else if (marks >= 70) {
        System.out.println("Grade : C");
    } else if (marks >= 60) {
        System.out.println("Grade : D");
    } else {
        System.out.println("Grade : F");
    }

    // nested if
    int currentAge = 20;
    boolean hasID = true;

    if (currentAge >= 18) {
        if (hasID) {
            System.out.println("Entry Allowed");
        } else {
            System.out.println("No ID, Entry Denied");
        }
    } else {
        System.out.println("Too Young, Entry Denied");
    }


    // switch statement
    int day = 3;

    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        default:
            System.out.println("Weekend");
    }

    //ternary
    int a = 10, b = 20;
    int max = (a > b) ? a : b;
    System.out.println("Max : " + max);



}