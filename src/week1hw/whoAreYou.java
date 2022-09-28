/*
Name: Felipe Zepeda
Date: 17th Feb 21
Program name: whoAreYou.java
 */
package week1hw;
import java.util.Scanner;
/**
 *
 * @author FRoZeHn
 */
public class whoAreYou {
    public static void main (String[] args) {
   Scanner keyboardinput;
   keyboardinput = new Scanner (System.in);
   System.out.println("|Program that tells you who you are from a given name|");
   System.out.println("May you please provide your full name?");
   String name = keyboardinput.nextLine();
   
   System.out.print("Your name is: ");
   System.out.println(name);
    }
}