void main(String[] args) {

    // for loop
    for(int i = 1; i<=5; i++){
        System.out.println("Count : " + i);
    }


    // while loop
    int j = 1;
    while(j <= 5){
        System.out.println("Count J : " + j);
        j++;
    }

    // do-while loop
    int k = 1;
    do{
        System.out.println("Count K : " + k);
        k++;
    } while (k<=5);


    // for-each loop works for array and collection

    int[] numbers = {10,20,30};

    for(int num : numbers){
        System.out.println("Element : " + num);
    }

    // for loop - printing index

    for (int i = 0; i < numbers.length; i++) {
        System.out.println("Index : " + i + "  Element : " + numbers[i]);
    }
}