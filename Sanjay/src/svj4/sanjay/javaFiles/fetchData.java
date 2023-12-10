package svj4.sanjay.javaFiles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class fetchData {
	public static List<String> videoTitles=new ArrayList<>();
	static List<String> videoValue=new ArrayList<>();
	static List<Double> videoValueInt=new ArrayList<>();
	
	
	public static List <String> fetchDataMethod(ResultSet results) throws SQLException
	{		
		if(results!=null) {
		while(results.next())
		{				
			videoTitles.add(results.getString(1)); 
			videoValue.add(results.getString(2));
		}
		}
		for(String myDouble : videoValue) {
			videoValueInt.add(Double.valueOf(myDouble));
		}
		if(videoTitles.isEmpty()==false) {
		return videoTitles;
		}
		else {
			return null;
		}
	}

}
