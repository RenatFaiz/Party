package com.company;

public class Main4 {
	public static void main(String[] args) {
		Person Vitya = new Person(120, "Vitya");
		Vitya.say("George");
		System.out.println(Vitya.name + "'s height is " + Vitya.height);
		
		Person Vlad = new Person();
		Vlad.say("Dima");
		System.out.println(Vlad.height);
		
		Person Dima = new Person("Dima");
		System.out.print(Dima.name);
		System.out.println("");
		
		Student freshmen = new Student(76, "Viktor", 3);
		freshmen.tell();
		Student powder = new Student(250, "Vladimir", 4);
		powder.tell();
	}
} 
