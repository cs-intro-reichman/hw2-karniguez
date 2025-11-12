// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		String mode = args[1]; 
        boolean ver = mode.equals("v");

		for (int i = 1; i <= number; i++){
		    int n = i;
		
		    if (ver) {
			    int co = 1;
			    System.out.print(n + " ");

				while (true){
					n = (n % 2 == 0) ? (n / 2) : (3 * n + 1);
                    System.out.print(n + " ");
                    co++;
                    if (n == 1) break;  
				}
				System.out.println("(" + co + ")"); 
         
	        } else {
				while (n != 1) {
                    n = (n % 2 == 0) ? (n / 2) : (3 * n + 1);
                }
            }
			
		}
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
	    }
	}
        
        
				
			
			
		
