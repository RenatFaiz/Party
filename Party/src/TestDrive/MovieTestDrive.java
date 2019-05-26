package TestDrive;

	public class MovieTestDrive {
		public static void main (String[] args) {
			Movie one = new Movie();
			one.title = "Ганвест - Никотин";
			one.genre = "Драма";
			one.rating = 500;
			Movie two = new Movie();
			two.title = "Профессионал";
			two.genre = "Боевик";
			two.rating = -5;
			two.playIt();
			Movie three = new Movie ();
			three.title = "Лос-Анжелес";
			two.genre = "Комедия";
			two.rating = 10;
			
		}
	}

