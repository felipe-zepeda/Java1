/*
Name: Felipe Zepeda
Date: 17th Feb 21
Program name: AgeConverter.java
 */
package week1hw;
import java.util.Scanner;
/**
 *
 * @author FRoZeHn
 */
public class AgeConverter {
    public static void main (String[] args) {    
   Scanner keyboardinput;
   keyboardinput = new Scanner (System.in);
   System.out.println("|Program that converts your age into months, weeks and days|");
   System.out.println("Please provide your age in years.");
   int age = keyboardinput.nextInt();
      
      System.out.print ("Age in years: ");
   System.out.println (age + " years.");
      System.out.print ("Converted age into months: ");
   System.out.println (age*12 + " months.");
      System.out.print ("Converted age into weeks: ");
   System.out.println (age*52 + " weeks.");
      System.out.print ("Converted age into days: ");
   System.out.println (age*364 + " days.");
    }
}