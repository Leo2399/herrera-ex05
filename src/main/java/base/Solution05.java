/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution05 {
    /*
    print "What is the first number?"
    'first number' = read string from user

    print "What is the second number?"
    'second number' = read string from user

    convert 'first number' string to integer 'x'
    convert 'second number' string to integer 'y'

    add int 'x' and int 'y'
    subtract int 'x' and int 'y'
    multiply int 'x and int 'y'
    divide int 'x' and int 'y'

    print "'x' + 'y' = 'sum'
           'x' - 'y' = 'difference'
           'x' * 'y' = 'product'
           'x' / 'y' = 'quotient'
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the first number? ");
        String first = input.nextLine();

        System.out.print("What is the second number? ");
        String second = input.nextLine();

        int x = Integer.parseInt(first);
        int y = Integer.parseInt(second);

        int sum = x + y;
        int diff = x - y;
        int prod = x * y;
        int qou = x / y;

        System.out.println(x+" + "+y+" = " +sum+"\n"
        +x+" - "+y+" = "+diff+"\n"
        +x+" * "+y+" = "+prod+"\n"
        +x+" / "+y+" = "+qou+"\n");
    }
}
