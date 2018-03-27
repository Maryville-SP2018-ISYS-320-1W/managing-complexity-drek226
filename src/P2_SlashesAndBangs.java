/*
  	ISYS 320
  	Name(s):
  	Date: 
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		|      (\)		|    	(!)	          |      (\)	   | 	
1                                        22 
2                     2                  18                  2
3                     4                  14                  4
4                     6                  10                   6
5                     8                   6                  8
6                     10                  2                  10

                            


*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 !!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!\\
\\\\!!!!!!!!!!!!!!\\\\
\\\\\\!!!!!!!!!!\\\\\\
\\\\\\\\!!!!!!\\\\\\\\
\\\\\\\\\\!!\\\\\\\\\\

Outer for loop to print all 6 lines 

inner loop to print  left side " \ "
inner loop to print " ! "
inner loop to print right side " \ "

 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		for (int line = 1; line <= 6; line++) {
			System.out.println();
			
			for (int slash = 1; slash <= (2* line + -2); slash++) {
				System.out.print("/");
			}
			
			
			for (int bangs= 1; bangs <= (-4 * line + 22); bangs++) {
				System.out.print("!"); 
				
			}
			for (int slash = 1; slash <= (2* line + -2); slash++) {
				System.out.print("/");
			}
			
	}
	}
}
	




