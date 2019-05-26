package com.company;
import java.util.Scanner;
public class Main2 {
	 public static void main(String[] args) {
		 Scanner ert = new Scanner (System.in);
		 int first, second=50;
		 boolean isTrue = true; 
		 System.out.println("Enter first number: ");
		 first = ert.nextInt();
		 isTrue = first == 51;
		 if (first >= second || isTrue)
			 System.out.print("Number is over 50");
		 else if (first == 45)
		 System.out.print("Number is 45");
		 else System.out.println("Number is lower than 50");
		 switch (first) {
		 case 51: System.out.print("Number is equal 51");
		 break;
		 default:
			 System.out.println("Num is something");
}
}
}