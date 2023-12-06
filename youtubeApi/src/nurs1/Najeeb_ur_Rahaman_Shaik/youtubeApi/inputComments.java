package nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi;

import java.io.IOException;
import java.util.Scanner;

public class inputComments {
	
	private static final boolean False = false;
	private static final boolean True = true;

	// method to check comments value
	public static boolean checkcomments(int c) {
		if ( c > 100){
			System.out.println("The comments cannot be greater than 100. Please input a number less than or equal to 100");
			return False;
		}
		else if(c == 0 || c < 0){
			System.out.println("The comments cannot be 0 or less than 0. Please input a number greater than 0");
			return False;
		}
		else {
		return True;
		}
	}
	
	// Method to take user input - Number of comments
	public static String input() throws IOException{
		try (Scanner scan = inputDetails.scan) { // use the canner class from inputDetails
			int t = 0;
			String output = null;
			while( t == 0) {  //loop till user enters valid input
				//create a variable to store user input comments
				System.out.print("Enter the number of comments you want the analysis on: ");
				int comments = scan.nextInt();
				if(checkcomments(comments)) {
					output = outputCommentData.output(inputDetails.query, inputDetails.results,  comments); // call output method from outputCommentData class
					t = 1;
				}
			}
			return output; //return output to inputDetails class
		}
	}
}
