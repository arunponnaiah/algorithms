package com.algorithms.scenario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Version2 - calculates event count at runtime based on the given time.
 * This version is very much in-line with challenge1.
 * @author aponnaia
 *
 */
public class EventEstimator {

/**
 * Take timestamp and returns event count.
 * @param ts
 * @return
 */
	
public int getEventCount(String ts){
		
		File file = new File("/Users/aponnaia/workspace/code-challenge/data/timeseries_10pst.txt");
		int eventCount=0;
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ts);
			Timestamp fromTime = new Timestamp(date.getTime()); 
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(date.getTime());
			cal.add(Calendar.HOUR, 1);
			Timestamp toTime = new Timestamp(cal.getTimeInMillis());
			eventCount = this.calculateEventCount(file, eventCount, fromTime, toTime);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return eventCount;
	}

/**
 * Calculates event counts based on evnets in file
 * @param file
 * @param eventCount
 * @param fromTime
 * @param toTime
 * @return
 * @throws FileNotFoundException
 * @throws IOException
 * @throws ParseException
 */

private int calculateEventCount(File file, int eventCount, Timestamp fromTime, Timestamp toTime)
		throws FileNotFoundException, IOException, ParseException {
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	String line=null;
	int lineCount=0;
	
	while( (line = bufferedReader.readLine()) != null){
		lineCount = lineCount +1;
		if(lineCount ==1)
			continue;
		Date eventDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(line);
		Timestamp eventTime = new Timestamp(eventDate.getTime());
		
		if(eventTime.after(fromTime) && eventTime.before(toTime)){
			eventCount = eventCount + 1;
		}
	}
	return eventCount;
}
}
