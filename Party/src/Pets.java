
public class Pets {
	public static void main (String[] args) {
		String[] pets = {"����", "����", "���"};
		int x = pets.length;
		int rand1 = (int) (Math.random() * x);
		String s = pets[rand1];
		System.out.print(s);
	}
}
