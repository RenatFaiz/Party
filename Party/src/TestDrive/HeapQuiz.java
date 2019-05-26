package TestDrive;

class HeapQuiz {
	int id = 0;
	public static void main(String[] args) {
		int x = 0;
		HeapQuiz[] hq = new HeapQuiz[5];
		while (x<3) {
			hq[x] = new HeapQuiz();
			hq[x].id = x;
			x++;
		}
		hq[3] = hq[1];//1
		hq[4] = hq[1];//1
		hq[3] = null;//пустая ссылка
		hq[4] = hq[0];//0
		hq[0] = hq[3];// пустая ссылка
		hq[3] = hq[2];//2
		hq[2] = hq[0];//0 пустые сслыки

		int j = 0;
		while (j<1) {
			if (hq[j] != null)
				System.out.println(hq[j].id); 
			j++;
		}
		
	}					
}

