package com.richa.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;

public class ResultHelper {

	// Delimiter used in file
	private static final String COMMA_DELIMITER = ",";

	/**
	 * 
	 * @param fileName
	 * @param results
	 */
	public static void readClinicCsvFile(String fileName, List<Result> results) {

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

		System.out.println(searchCriteria.get("department"));
		System.out.println(searchCriteria.get("radio"));
		System.out.println("size "+ completeResult.size());
		List<Result> searchedResult = new ArrayList<Result>();
		String classType = "0";
		for (Result r : completeResult) {
			if ("UGRD".equalsIgnoreCase(r.getAcadCareer())) {
				classType = "1";
			} else if ("GRAD".equalsIgnoreCase(r.getAcadCareer())) {
				classType = "2";
			}
			if ((searchCriteria.get("radio")).equalsIgnoreCase(classType)
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
		List<FinalResults> fResult = new ArrayList<FinalResults>();
		FinalResults res;

		List<FinalResults> clusteredResults = new ArrayList<FinalResults>();
		
		List<String> string = new ArrayList<String>();

		for (Result r : result) {
/*			res = new FinalResults();
			res.setCluster(r.getLabel());
		res.setCampus(r.getCampus());
			res.setStartTime(r.getStartTime());
			res.setEndTime(r.getEndTime());
			fResult.add(res);*/
			string.add(r.getLabel());
		}

		Set<String> uniqueSet = new HashSet<String>(string);
		FinalResults f ;

		for (String temp : uniqueSet) {
			f = new FinalResults();
			f.setNumberOfClasses(Collections.frequency(string, temp));
			f.setCluster(temp);
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
		readClinicCsvFile(fileName, results);
		List<Result> filteredResult = filterBySearch(results, value);
		List<FinalResults> finalResults = filterByCluster(filteredResult);
		return finalResults;
	}

}
