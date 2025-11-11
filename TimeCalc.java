public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt( 0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String sMin;
		String sHow;
		
	
		int add = Integer.parseInt((args [1]));
		int hou = (add / 60 );
		int min = (add % 60);

		int addmin = (minutes + min);
		int neWamin = (addmin / 60);
		int neWmin = (addmin % 60);
		    if (neWmin < 10){
				sMin = ("0" + neWmin);
			}
			else{
			    sMin = ("" + neWmin);
			}
	
		int neWhou = (hours + hou + neWamin);
			if  (neWhou > 23){
				if ((neWhou % 24) < 10){
				sHow = ("0" + (neWhou % 24));
				}
				else{
				sHow = ( "" + (neWhou % 24));
				}
			}
			else if (neWhou == 0)  {
				sHow = ("0" + neWhou);	
			}
			else if (neWhou < 10){
				sHow = ("0" + neWhou);
			}
			else {
				sHow = ("" + neWhou);
			}
		System.out.println(sHow + ":" + sMin);
		}
	}

		
		

    
