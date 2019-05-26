package Final_Static;

public final class Main { //у класса не может быть наследников

	public final static void main(String[] args) { //у метода не может быть полиморфизма
		final int y = Math.mult(12, 35);
		System.out.println(y);
	//y = 43; - ошибка. Переменная уже final - нельзя переопределить	
		Math a = new Math();
		System.out.println(a.x);
		a.x = 24;
		System.out.println(a.x);
		Math b = new Math();
		System.out.println(b.x);
		
	}

}
