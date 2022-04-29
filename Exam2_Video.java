import java.util.*;

class Video_Task {
    public static long method1(String s) {
        long accum = 0;
        int mult = 0;

        for (int i = s.length() - 1; i > -1; i--) {
            char digit = s.charAt(i);
            accum += ( (int) digit - 48 ) * ( Math.pow(10, mult) );
            mult++;
        }

        return accum;
    }

    /* 
    Fill out the below table on video
    Fill out blanks in following questions
    |-----------------------------------------------|
    | Line                      | Number of Steps   |
    | long accum = 0            |                   |
    | int mult = 0              |                   |
    | int i = s.length() - 1    |                   |
    | i > -1                    |                   |
    | i--                       |                   |
    | char digit = s.charAt(i)  |                   |
    | accum += ...              |                   |
    | mult++                    |                   |
    | return accum              |                   |
    |-----------------------------------------------|

    Runtime Equation: ____

    Total runtime: O(___)
    */

    public static int[] method2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                int amount = 1;

                for (int j = 0; j < arr.length / 2; j++) {
                    amount *= arr[i];
                }

                arr[i] = amount;
            }
        }

        return arr;
    }

    /* 
    Fill out the below table on video
    Fill out blanks in following questions

    |-----------------------------------------------|
    | Line                      | Number of Steps   |
    | int i = 0                 |                   |
    | i < arr.length            |                   |
    | i++                       |                   |
    | if (i % 3 == 0)           |                   |
    | int amount = 1            |                   |
    | int j = 0                 |                   |
    | j < arr.length / 2        |                   |
    | j++                       |                   |
    | amount *= arr[i]          |                   |
    | arr[i] = amount           |                   |
    | return arr                |                   |
    |-----------------------------------------------|
    
    Runtime Equation: ____

    Total runtime: O(___)
    */
}