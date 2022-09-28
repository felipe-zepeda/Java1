/*
Name: Felipe Zepeda
Date: 17th Feb 21
Program name: Calculator.java
 */
package week1hw;
import java.util.Scanner;
/**
 *
 * @author FRoZeHn
 */
public class Calculator {
    public static void main (String [] args) {
    Scanner keyboardinput;
    keyboardinput = new Scanner (System.in);
    System.out.println ("|Program that adds, subtracts, multiplies and divides two given numbers|");    
      System.out.println ("Please type the first number.");
      double n1 = keyboardinput.nextDouble();
      System.out.println ("Please type the second number.");
      double n2 = keyboardinput.nextDouble();
      
        System.out.print ("The sum of " + n1);
        System.out.print (" and " + n2);
        System.out.println (" is: " + (n1+n2));
        
        System.out.print ("The subtraction of " + n1);
        System.out.print (" and " + n2);
        System.out.println (" is: " + (n1-n2));
        
        System.out.print ("The multiplication of " + n1);
        System.out.print (" by " + n2);
        System.out.println (" is: " + (n1*n2));
        
        System.out.print ("The division of " + n1);
        System.out.print (" by " + n2);
        System.out.println (" is: " + (n1/n2));
    }
}