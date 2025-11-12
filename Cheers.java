
import com.sun.source.tree.WhileLoopTree;

//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String word = args [0];
            String word1 = word.toUpperCase();
            int number = Integer.parseInt(args[1]);
            String vowels = "AEFHILMSXNOR";
            int i = 0;
            while (i < word1.length()){
                char c = (word1.charAt(i));
                if (vowels.indexOf(c) != -1){
                System.out.println("Give me " + "an " + c + ": " + c + "!");
                }else{
                    System.out.println("Give me " + "a  " + c + ": " + c + "!");
                }
                i++;
                } 
                System.out.println("What does that spell?");
            int j = 0;
            while (j < number) {
                System.out.println(word1 + "!!!"); 
                j++;
        }
              
        
            }

        }




