package nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class inputDetails {
	
	private static final boolean True = true;
	private static final boolean False = false;
	
	public static String query;
	public static int results;
	public static Scanner scan = new Scanner(System.in); // create a public scanner class to take user inputs

	// Method to check if entered input is valid
	public static boolean checkresults(int r) {
		if(r > 10) {
			System.out.println("The results cannot be greater than 10. Please input a number less than or equal to 10");
			return False;
		}
		else if(r == 0 || r < 0){
			System.out.println("The results cannot be 0 or less than 0. Please input a number greater than 0");
			return False;
		}
		else {
		return True;
		}
	}
	
	// Method to take user input
	public static String input() throws MalformedURLException{
		//create a variable to store user input text
		System.out.print("Enter text to search: "); 
		query = scan.nextLine();
		String output = null;
		//create a variable to store user input results
		int t = 0;
		while( t == 0) { // loop to take user input until a valid input is entered
			System.out.print("Enter the number of results you want: ");
			results = scan.nextInt();
			if(checkresults(results)) { //call check results method and only proceed if the input is valid
				output = OutputVideoData.output(query, results); // call output method from OutputVideoData Class
				t = 1;
			}
		}
		return output; // return output string to display to the user
	}

	// Main method
	public static void main(String[] args) throws IOException{
		String end = input();
		System.out.println(end); // print when video details are gathered
		String end_comments = inputComments.input();
		System.out.println(end_comments); // print when comment details are gathered
	}
}
