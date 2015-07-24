/**
 * 
 */
package com.richa.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.richa.model.FinalResults;
import com.richa.model.Result;
import com.richa.model.ResultHelper;

/**
 * @author Richa
 *
 */
public class ResultHelperTest {

	/**
	 * Test method for {@link com.richa.model.ResultHelper#readCsvFile(java.lang.String, java.util.List)}.
	 */
	@Test
	public final void testReadClinicCsvFile() {
		List<Result> result = new ArrayList<Result>();
		ResultHelper.readCsvFile(
				"C:/Users/Richa/git/COMP412-final-project/LocusCourseSearch/src/com/richa/test/clusterResults.csv", result);
		assertEquals(14163, result.size());
	}
	
	/**
	 * Test method for {@link com.richa.model.ResultHelper#readCsvFile(java.lang.String, java.util.List)}.
	 */
	@Test
	public void readCsvFileEmptyTest() {
		List<Result> result = new ArrayList<Result>();
		ResultHelper.readCsvFile(
				"C:/Users/Richa/git/COMP412-final-project/LocusCourseSearch/src/com/richa/test/clusterResultsEmpty.csv", result);
		assertEquals(0, result.size());
	}

	/**
	 * Test method for {@link com.richa.model.ResultHelper#filterBySearch(java.util.List, java.util.Map)}.
	 */
	@Test
	public final void testFilterBySearch() {
		String fileName = "C:/Users/Richa/git/COMP412-final-project/LocusCourseSearch/src/com/richa/test/clusterResults1Row.csv";
		List<Result> results = new ArrayList<Result>();
		ResultHelper.readCsvFile(fileName, results);
		Map<String, String> value = new HashMap<String, String>();
		value.put("department", "ACCT");
		value.put("radio", "1");
		List<Result> filteredResult = ResultHelper.filterBySearch(results, value);
		assertEquals(1, filteredResult.size());
	}

	/**
	 * Test method for {@link com.richa.model.ResultHelper#filterByCluster(java.util.List)}.
	 */
	@Test
	public final void testFilterByCluster() {
		String fileName = "C:/Users/Richa/git/COMP412-final-project/LocusCourseSearch/src/com/richa/test/clusterResults1Row.csv";
		List<Result> results = new ArrayList<Result>();
		ResultHelper.readCsvFile(fileName, results);
		Map<String, String> value = new HashMap<String, String>();
		value.put("department", "ACCT");
		value.put("radio", "1");
		List<Result> filteredResult = ResultHelper.filterBySearch(results, value);
		List<FinalResults> finalResults = ResultHelper.filterByCluster(filteredResult);
		assertEquals(1, finalResults.size());
	}

	/**
	 * Test method for {@link com.richa.model.ResultHelper#getExpandedResult(java.util.Map)}.
	 */
	@Test
	public final void testGetExpandedResult() {
		Map<String, String> value = new HashMap<String, String>();
		value.put("department", "ACCT");
		value.put("radio", "1");
		value.put("cluster","cluster_4");
		List<Result> expandedList = ResultHelper.getExpandedResult(value);
		assertEquals(4, expandedList.size());
	}

	/**
	 * Test method for {@link com.richa.model.ResultHelper#getTimeOnly(java.lang.String)}.
	 */
	@Test
	public final void testGetTimeOnly() {
		assertEquals("12:30 PM", ResultHelper.getTimeOnly("12/30/99 12:30 PM"));
	}
	
	/**
	 * Test method for {@link com.richa.model.ResultHelper#getTimeOnly(java.lang.String)}.
	 * @throws ParseException 
	 */
	@Test
	public final void testGetTime() throws ParseException {
		DateFormat format = new SimpleDateFormat("mm/dd/yy HH:MM a");
		Date d = format.parse("12/30/99 12:30 PM");
		assertEquals(d, ResultHelper.getTime("12/30/99 12:30 PM"));
	}

}
