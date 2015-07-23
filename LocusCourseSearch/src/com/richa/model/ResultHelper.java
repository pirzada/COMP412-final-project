package com.richa.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class ResultHelper {

	// Delimiter used in file
	private static final String COMMA_DELIMITER = ",";

	/**
	 * Reads the health clinic file and store the data into a list
	 * 
	 * @param fileName
	 * @param Clinics
	 */
	public static void readClinicCsvFile(String fileName, List<Result> results) {

		BufferedReader fileReader = null;
		try {

			// Create a new list of clinics to be filled by CSV file data
			// List<HealthClinic> Clinics = new ArrayList<HealthClinic>();

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
					// Create a new Clinic object and fill data
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

}
