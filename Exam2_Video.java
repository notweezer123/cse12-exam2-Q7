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
    Big O refers to the tight bound in this question
    |-----------------------------------------------|
    | Line                      | Number of Steps   |
    | long accum = 0            | 1                 |
    | int mult = 0              | 1                 |
    | int i = s.length() - 1    | 1                 |
    | i > -1                    | N                 |
    | i--                       | N-1                 |
    | char digit = s.charAt(i)  | N-1                 |
    | accum += ...              | N-1                  |
    | mult++                    | N-1                  |
    | return accum              | 1                  |
    |-----------------------------------------------|

    Runtime Equation: 5N

    Total runtime: O(N)
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
    Big O refers to the tight bound in this question

    |-----------------------------------------------|
    | Line                      | Number of Steps   |
    | int i = 0                 | 1                  |
    | i < arr.length            | N+1                 |
    | i++                       | N                  |
    | if (i % 3 == 0)           | N                 |
    | int amount = 1            | N/3                 |
    | int j = 0                 | N/3                 |
    | j < arr.length / 2        | N^2/6 + N/3                  |
    | j++                       | N^2/6                  |
    | amount *= arr[i]          | N^2/6                  |
    | arr[i] = amount           | N/3                  |
    | return arr                | 1                  |
    |-----------------------------------------------|
    
    Runtime Equation: 3N + 4N/3 + 3N^2/6 + 3

    Total runtime: O(N^2)
    */
}
