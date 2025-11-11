// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		double co = 0;
		//int app1 = 0;
		//int app2 = 0;
		for (int i = 1; i <= number; i++){
			if (i % 2 == 0){
				co -= 1.0/((i*2) - 1);
			}
			else {
				co += 1.0/(i*2 - 1);
			}
		}
		double tot = co * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + tot);
		}
	}
