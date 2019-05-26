package DudarComp.Shapes;

public class Main {

	public static void main(String[] args) {
	Computer comp = new Computer();
	comp.i7.start();
	comp.transfer.start();
	comp.transfer.shutdown();
	
//new Computer() {
//	void SuperComp() {this.i7.start();
//		this.transfer.start();}
//};
	}

}
