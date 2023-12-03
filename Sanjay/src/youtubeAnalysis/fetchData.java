package youtubeAnalysis;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class fetchData {
	static List<String> videoTitles=new ArrayList<>();
	static List<String> videoValue=new ArrayList<>();
	static List<Double> videoValueInt=new ArrayList<>();
	
	
	public static void fetchDataMethod(ResultSet results) throws SQLException
	{		
		while(results.next())
		{				
			videoTitles.add(results.getString(1)); 
			videoValue.add(results.getString(2));
		}
		for(String myDouble : videoValue) {
			videoValueInt.add(Double.valueOf(myDouble));
		}	
	}

}
