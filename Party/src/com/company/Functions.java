package com.company;
import java.util.Scanner;
public class Functions {
	public static void main(String[] args) {
func (5,4);
readArray();
}
	public static int[] readArray() {
		int [] arr;
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int [n];
		for (int i = 0; i < n; i++)
		arr[i]=in.nextInt();
		System.out.println(arr);
		return arr;
	}
	
	
public static void func (int a, int b) {
	int result = 1;
	for (int i = 0; i < b; i++) 
	result*=a;
	System.out.println(result);
}
}
