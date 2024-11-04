package com.minadag.javaloops;

public class Loops {
    public static void main(String[]args) {
        // for loop
        int[] myNumbers = {5,4,8,3};
        for (int i = 0; i < myNumbers.length; i++){
            int x = myNumbers[i] * 10 / 2;
          //  System.out.println(x);
        }
        // for loop 2

        for(int number : myNumbers){
            System.out.println(number * 10 / 2);
        }

        for(int a= 0; a < 10; a++ ){
            int b = a * 10;
            System.out.println(b);
        }

        // while

        int j = 0;

        while (j < 10){
            System.out.println("test");
            j++;
        }

        int z = 0;
        while (z <5){
            int m = z * 10;
            System.out.println(m);
            z++;
        }
    }
}
