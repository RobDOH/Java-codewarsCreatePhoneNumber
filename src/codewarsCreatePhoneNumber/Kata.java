/**
 * 
 */
package codewarsCreatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Robert
 * @version 1.0 Date 20200722 Write a function that accepts an array of 10
 *          integers (between 0 and 9), that returns a string of those numbers
 *          in the form of a phone number. Example:Kata.createPhoneNumber(new
 *          int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 */
public class Kata {
	public static String[] createPhoneNumber(int[] numbers) {
		// Your code here!
		int[] number = { 1234567890 }; // create an array
		for (int i : number) { // loop
			String string = Integer.toString(i);// return the String object representing this Integer’s value.
			String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
			Pattern pattern = Pattern.compile(regex);//A Pattern object is a compiled representation of a regular expression
			Matcher matcher = pattern.matcher(string);//used to match the input sequence against the whole text
			if (matcher.matches()) {//  //Matching the particular pattern against regular expression 
				System.out.println(matcher.replaceFirst("($1) $2-$3"));
			}
		}
		return null;
	}

	public static void main(String[] args) {
		createPhoneNumber(null);
	}
}
