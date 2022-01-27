/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.HashMap;

public class TheWrongWayCow {

	int x;
	int y;

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!
		int north = 0;
		int south = 0;
		int east = 0;
		int west = 0;
		HashMap<String, int[]> hm = new HashMap<String, int[]>(4);
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (hm.size() > 1 && (north + south + east + west > 2)) {
					i = field.length;
					break;
				}
				if (field[i][j] == 'c') {
					int numRows = field.length;
					int numCols = field[i].length;

					// North
					if (north < 2) {
						if (i + 2 < numRows && field[i + 1][j] == 'o' && field[i + 2][j] == 'w') {
							hm.put("north", new int[] { j, i });
							north++;
							continue;
						}
					}
					if (south < 2) {
						if (i - 2 < 0 && field[i+1][j] == 'o' && field[i +2][j] == 'w') {
							hm.put("south", new int[] { j, i});
							south++;
							continue;
						}
					}
					if (east < 1) {
						if (i +1 < numColumns && field[i+1][j] == 'o' && field[i+2][j] == 'w') {
							hm.put("east", new int[] {j, i});
							east++;
							continue;
						}
					}
					if (west < 1) {
						if (i + 1 <0 && field[i+1][j] == 'o' && field[i+2][j] == 'w') {
							hm.put("west", new int[] {j, i});
							west++;
							continue;
						}
					}

				}

			}
		}
		if (north == 1) {
			return hm.get("north");
		}

		return null;
	}

}
