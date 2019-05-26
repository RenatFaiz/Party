package DudarComp.Overload_Methods;

public class MainOverload {

			public static int summ (int a, int b) {
				return a+b;
			}
			
			public static float summ (float a, float b, float g) {
			    return a + b + g;
			}
			
			public static void main (String[] args) {
				System.out.println(summ (23, 12));
			    System.out.println(summ (23, 12.45f, 15.1f));
			}
			
		}
