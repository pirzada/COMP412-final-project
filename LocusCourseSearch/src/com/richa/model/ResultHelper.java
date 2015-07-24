package com.richa.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.Collections;
import java.util.Date;

public class ResultHelper {

	// Delimiter used in file
	private static final String COMMA_DELIMITER = ",";

	/**
	 * 
	 * @param fileName
	 * @param results
	 */
	public static void readCsvFile(String fileName, List<Result> results) {

		BufferedReader fileReader = null;
		try {

			String line = "";

			// Create the file reader
			fileReader = new BufferedReader(new FileReader(fileName));

			// Read the CSV file header to skip it
			fileReader.readLine();

			// Read the file line by line starting from the second line
			while ((line = fileReader.readLine()) != null) {
				// Get all tokens available in line
				String[] data = line.split(COMMA_DELIMITER);
				if (data.length > 0) {
					// Create a new Result object and fill data
					Result result = new Result(data[0], (data[1] + "," + data[2]), data[3], data[4], data[5], data[6],
							data[7], data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15],
							data[16], data[17], data[18], data[19], data[20], data[21], data[22], data[23], data[24],
							data[25], data[26], data[27], data[28], data[29], data[30], data[31], data[32], data[33],
							data[34]);
					results.add(result);
				}
			}

		} catch (Exception e) {
			System.out.println("Error in CsvFileReader !!!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("Error while closing fileReader !!!");
				e.printStackTrace();
			}
		}

	}

	/**
	 * 
	 * @param completeResult
	 * @param searchCriteria
	 * @return
	 */
	public static List<Result> filterBySearch(List<Result> completeResult, Map<String, String> searchCriteria) {
		List<Result> searchedResult = new ArrayList<Result>();
		String classType = "0";
		for (Result r : completeResult) {
			if ("UGRD".equalsIgnoreCase(r.getAcadCareer())) {
				classType = "1";
			} else if ("GRAD".equalsIgnoreCase(r.getAcadCareer())) {
				classType = "2";
			}
			if (classType.equalsIgnoreCase((searchCriteria.get("radio")))
					&& (searchCriteria.get("department")).equalsIgnoreCase(r.getSubject())) {
				searchedResult.add(r);
			}
		}
		System.out.println(searchedResult.size());
		return searchedResult;

	}

	/**
	 * 
	 * @param result
	 * @return
	 */
	public static List<FinalResults> filterByCluster(List<Result> result) {

		List<FinalResults> clusteredResults = new ArrayList<FinalResults>();

		List<String> string = new ArrayList<String>();

		for (Result r : result) {
			string.add(r.getLabel());
		}

		Set<String> uniqueSet = new HashSet<String>(string);
		FinalResults f;

		for (String temp : uniqueSet) {
			f = new FinalResults();
			f.setNumberOfClasses(Collections.frequency(string, temp));
			/*
			 * DateFormat format1 = new SimpleDateFormat("HH:mm a");
			 * format1.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
			 * Date sTime = getTime("12/12/12 12:00 PM"), eTime = getTime(
			 * "12/12/99 12:00 AM");
			 */
			String campus = null;
			String sTime = null;
			String eTime = null;
			for (Result r : result) {
				if (r.getLabel().equals(temp)) {
					/*
					 * if (sTime.compareTo(getTime(r.getStartTime())) > 0) {
					 * sTime = getTime(r.getStartTime()); } if
					 * (eTime.compareTo(getTime(r.getEndTime())) < 0) { eTime =
					 * getTime(r.getEndTime()); }
					 */
					sTime = getTimeOnly(r.getStartTime());
					eTime = getTimeOnly(r.getEndTime());
					campus = r.getCampus();
				}
			}

			f.setStartTime(sTime);
			f.setEndTime(eTime);
			f.setCluster(temp);
			f.setCampus(campus);
			clusteredResults.add(f);
		}

		return clusteredResults;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static List<FinalResults> search(Map<String, String> value) {
		String fileName = "C:/Users/Richa/git/COMP412-final-project/LocusCourseSearch/clusterResults.csv";
		List<Result> results = new ArrayList<Result>();
		readCsvFile(fileName, results);
		List<Result> filteredResult = filterBySearch(results, value);
		List<FinalResults> finalResults = filterByCluster(filteredResult);
		/*
		 * Map<String, Object> fResult = new HashMap<String, Object>();
		 * fResult.put("clusteredResult", finalResults);
		 * fResult.put("filteredResult", filteredResult);
		 */
		return finalResults;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static List<Result> getExpandedResult(Map<String, String> value) {
		String fileName = "C:/Users/Richa/git/COMP412-final-project/LocusCourseSearch/clusterResults.csv";
		List<Result> results = new ArrayList<Result>();
		readCsvFile(fileName, results);
		List<Result> filteredResult = filterBySearch(results, value);

		List<Result> result = new ArrayList<Result>();
		String cluster = value.get("cluster");
		for (Result r : filteredResult) {
			if (r.getLabel().equalsIgnoreCase(cluster)) {
				r.setStartTime(getTimeOnly(r.getStartTime()));
				r.setEndTime(getTimeOnly(r.getEndTime()));
				result.add(r);
			}

		}
		return result;
	}

	/**
	 * 
	 * @param dateTime
	 * @return
	 */
	public static Date getTime(String dateTime) {

		DateFormat format = new SimpleDateFormat("mm/dd/yy HH:MM a");
		format.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
		Date d = null;
		try {
			d = format.parse(dateTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}

	/**
	 * 
	 * @param dateTime
	 * @return
	 */
	public static String getTimeOnly(String dateTime) {
		String time = dateTime.substring(9);
		return time;
	}

}
