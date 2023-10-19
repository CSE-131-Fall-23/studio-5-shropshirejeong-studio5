package studio5;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double distance = 0;
		// FIXME: Hint use Math methods (e.g. Math.sqrt) to compute the distance
		double x = Math.abs(x1-x2);
		double y = Math.abs(y1-y2);
		double a = Math.pow(x,2);
		double b = Math.pow(y,2);
		double sum = a + b;
		double distance1 = Math.sqrt(sum);
		
		return distance1;
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);

		// TODO: Draw the remaining rings of the bull's eye
		// Blue ring with 3.0/4.0 the radius
		// suggested rgb values: 0, 109, 219
		StdDraw.setPenRadius(0.02);
		Color NewBLUE = new Color(0,109,219);
		StdDraw.setPenColor(NewBLUE); 
		StdDraw.circle(x, y, radius*3.0/4.0);

		// Red ring with 1.0/2.0 the radius
		// suggested rgb values: 146, 0, 0
		StdDraw.setPenRadius(0.02);
		Color NewRED = new Color(146,0,0);
		StdDraw.setPenColor(NewRED); 
		StdDraw.circle(x, y, radius*1.0/2.0);
		

		// Yellow ring with 1.0/4.0 the radius
		// suggested rgb values: 255, 255, 109
		StdDraw.setPenRadius(0.02);
		Color NewYELLOW = new Color(255,255,109);
		StdDraw.setPenColor(NewYELLOW); 
		StdDraw.circle(x, y, radius*1.0/4.0);

		
	}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param words2      the source String
	 * @param targetword2      the target character to be replaced
	 * @param replace2 the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String[] words2, String[] targetword2, String[] replace2) {
		String[] words = {"This", "is", "a", "test"};
		String[] targetword = {"is"};
		String[] replace = {"__"};
		String result = "";
		// TODO: Finish this method
		for (int i = 0; i<4; i++) {
			if (words[i]==targetword) {
				words.replacment
			}
		substituteAll(words,targetword,replace);
		}
		return result;
	}

	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
		int sum = 0;
		// FIXME: Compute the sum of the values in an array
		
		return sum;
	}

	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return and array of size that's filled with value
	 */
	public static int[] filledArray(int length, int value) {
		int[] values = null; // FIXME: Create an array of the appropriate size
		// TODO: Finish this method

		

		return values;
	}

	// TODO: Create an arrayMean method which accepts an int array of values parameter.
	// TODO: Create a JavaDoc comment for the arrayMean method.

	
}
