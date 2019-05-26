package TestDrive;

import java.util.Scanner;

public class GameLauncher {
	public static void main (String[] args) {
		//String Player1;
		//String Player2;
		//String Player3;
		int rand1 = (int) (Math.random()*5);
		int rand2 = (int) (Math.random()*6);
		//int rand3 = (int) (Math.random());
		int n1;
		int n2;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число: " + rand1);
		n1 = in.nextInt();
		System.out.println("Введите число: " + rand2);
		n2 = in.nextInt();
		
		if (n1 == rand1 & n2 == rand2) 
			System.out.println("Вы выиграли");
		
		else System.out.println("Попробуйте снова");
}
}