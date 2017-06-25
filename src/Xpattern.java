/* Write a program to print the "X" pattern
*_______*
__*___*
____*
__*___*
*_______*

* Formatting and indentation is done automatically by SaveActions setting in Eclipse*/

public class Xpattern {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) { // Iterates through the 5 rows
			for (int j = 0; j < 9; j++) { // Iterates through the 9 columns
				if (j == 2 * i || 8 - 2 * i == j) // Checks if the index has
													// reached the required
													// position
													// (0,0),(1,2),(2,4),(3,6),(4,8)
													// or
													// (0,8),(1,6),(2,4),(3,2),(4,0)
					System.out.print("*"); // the previous line logic takes care
											// of printing * in the right place
				else if (8 - 2 * i < j && j > 2 * i) // does not print
														// underscore in the
														// blank spaces after
														// second * , refer
														// screenshot named
														// logic.jpg for
														// understanding
					break;
				else
					System.out.print("_"); // obviously the remaining area will
											// be filled with underscore _
			}
			System.out.println(); // go to next line after reaching end of j
		}

	}

}
