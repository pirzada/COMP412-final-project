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
					Result result = new Result(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4],
							Integer.parseInt(data[5]), data[6], data[7], data[8], data[9], data[10], data[11], data[12],
							(data[13].charAt(0)), Integer.parseInt(data[14]), Integer.parseInt(data[15]),
							Integer.parseInt(data[16]), Integer.parseInt(data[17]), data[18], data[19],
							(data[20].charAt(0)), (data[21].charAt(0)), (data[22].charAt(0)), (data[23].charAt(0)),
							(data[24].charAt(0)), (data[25].charAt(0)), (data[26].charAt(0)), data[27], data[28],
							data[29], Integer.parseInt(data[30]), Long.parseLong(data[31]), data[32], data[33]);
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
	public static List<Result> filterBySearch(List<Result> completeResult, Map<String,String> searchCriteria){
		
		List<Result> searchedResult = new ArrayList<Result>();
		
		for(Result r :completeResult){
			if(searchCriteria.get("").equals(r.getAcadCareer()) && searchCriteria.get("").equals(r.getSubject()) ){
				searchedResult.add(r);
			}
		}
		
		
		return searchedResult;
		
	}
	
	/**
	 * 
	 * @param result
	 * @return
	 */
	public static List<FinalResults> filterByCluster(List<Result> result){
		List<FinalResults> fResult = new ArrayList<FinalResults>();
		FinalResults res ;
		
		List<FinalResults> clusteredResults = new ArrayList<FinalResults>();
		
		
		for(Result r :result){
			res = new FinalResults();
			res.setCluster(r.getLabel());
			res.setCampus(r.getCampus());
			res.setStartTime(r.getStartTime());
			res.setEndTime(r.getEndTime());
			fResult.add(res);
		}
		
		Set<FinalResults> uniqueSet = new HashSet<FinalResults>(fResult);
		
		for (FinalResults temp : uniqueSet) {
			temp.setNumberOfClasses(Collections.frequency(fResult, temp));
			clusteredResults.add(temp);
		}
		
		return clusteredResults;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static List<FinalResults> search(Map<String, String> value){
		String fileName =  "C:/Users/Richa/git/COMP412-final-project/LocusCourseSearch/clusterResults.csv";
		List<Result> results = new ArrayList<Result>();
		readClinicCsvFile(fileName, results);
		
		List<Result> filteredResult = filterBySearch(results, value);
		
		List<FinalResults> finalResults = filterByCluster(filteredResult);
		return finalResults;
	}

}
