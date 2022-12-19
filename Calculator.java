import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

import javax.naming.OperationNotSupportedException;
public class Calculator2 {
    public static void main(String[] args)
    {
        double num1, num2;

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
    
        // take the inputs
        num1 = sc.nextDouble();
        
        num2 = sc.nextDouble();
        
        System.out.println("Enter the operator (+,-,*,/)");


        char operator = sc.next().charAt(0);


        double calculate = 0;

        switch (operator) {


//  add two numbers
case '+':
calculate = num1 + num2;


break;

//  subtract two numbers
case '-':

calculate = num1 - num2;

break;

//  multiple two numbers
case '*':

calculate = num1 * num2;

break;
// case to divide two numbers
case '/':

calculate = num1 / num2;

break;

default:

System.out.println("You enter wrong input");

break;
}

System.out.println("here the answer:");

System.out.println();

// print theanswer

System.out.println(num1 + "\t" + operator + "\t" + num2 + "\t" + " = " + calculate);

    }
    


}
