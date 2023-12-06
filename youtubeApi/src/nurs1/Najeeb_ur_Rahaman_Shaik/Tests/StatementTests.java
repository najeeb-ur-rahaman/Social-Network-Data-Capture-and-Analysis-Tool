package nurs1.Najeeb_ur_Rahaman_Shaik.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputComments;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputDetails;

public class StatementTests {

	//Tests to check results value
	@Test 
	public void testcheckresultsequalto0(){
		assertEquals(false, inputDetails.checkresults(0));
	}
	
	@Test 
	public void testcheckresultslessthan0(){
		assertEquals(false, inputDetails.checkresults(-1));
	}
	
	@Test 
	public void testcheckresultsgreaterthan10(){
		assertEquals(false, inputDetails.checkresults(12));
	}
	
	@Test 
	public void testcheckresults(){
		assertEquals(true, inputDetails.checkresults(6));
	}
	
	
	// Tests to check comments
	@Test 
	public void testcheckcommentsequalto0(){
		assertEquals(false, inputComments.checkcomments(0));
	}
	
	@Test 
	public void testcheckcommentslessthan0(){
		assertEquals(false, inputComments.checkcomments(-1));
	}
	
	@Test 
	public void testcheckcommentsgreaterthan100(){
		assertEquals(false, inputComments.checkcomments(120));
	}
	
	@Test 
	public void testcheckcomments(){
		assertEquals(true, inputComments.checkcomments(6));
	}
	
	@Test 
	public void testcheckcomments2(){
		assertEquals(true, inputComments.checkcomments(60));
	}

}
