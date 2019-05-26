package DudarComp.Shapes;

public class Computer {
class Proccessor {
	private boolean isStart = false;
	
	public void start() {
		isStart = true;
		System.out.println("i7 isStart = " + isStart);
	}
	public void shutdown() {
		isStart = false;
	}
}
class RAM {
	private boolean isStart = false;
	
	public void start() {
		isStart = true;
		System.out.println("RAM isStart = " + isStart);
	}
	public void shutdown() {
		isStart = false;
		System.out.println("RAM isStart = " + isStart);
	}
}

Proccessor i7 = new Proccessor();
RAM transfer = new RAM(); 
}