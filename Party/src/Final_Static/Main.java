package Final_Static;

public final class Main { //� ������ �� ����� ���� �����������

	public final static void main(String[] args) { //� ������ �� ����� ���� ������������
		final int y = Math.mult(12, 35);
		System.out.println(y);
	//y = 43; - ������. ���������� ��� final - ������ ��������������	
		Math a = new Math();
		System.out.println(a.x);
		a.x = 24;
		System.out.println(a.x);
		Math b = new Math();
		System.out.println(b.x);
		
	}

}
