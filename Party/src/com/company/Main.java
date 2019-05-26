package com.company;
import java.util.Scanner;
 public class Main {

 public static void main(String[] args) {
Scanner num = new Scanner(System.in);
float first, second, result;
 System.out.print("Enter first number: ");
 first = num.nextFloat();
 System.out.print("Enter second number: ");
 second = num.nextFloat();
 result = first / second;
 result = result/2; // то же самое, если result/= 2
 System.out.println("The result is " + result);
 }
}