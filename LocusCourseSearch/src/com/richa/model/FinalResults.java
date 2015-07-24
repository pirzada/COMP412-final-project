package com.richa.model;

/**
 * 
 * @author Richa
 *
 */
public class FinalResults {
	
	//Result to show clustered data
	String cluster;
	int numberOfClasses;
	String startTime;
	String endTime;
	String campus;
	
	//Default Constructor
	public FinalResults(){
		
	}
	
	//Constructor for mapping values
	public FinalResults(String cluster,
	int numberOfClasses,
	String startTime,
	String endTime,
	String campus){
		this.cluster = cluster;
		this.numberOfClasses = numberOfClasses;
		this.startTime = startTime;
		this.endTime = endTime;
		this.campus =  campus;
		
	}
	
	/**
	 * @return the cluster
	 */
	public String getCluster() {
		return cluster;
	}
	
	/**
	 * @param cluster the cluster to set
	 */
	public void setCluster(String cluster) {
		this.cluster = cluster;
	}
	
	/**
	 * @return the numberOfClasses
	 */
	public int getNumberOfClasses() {
		return numberOfClasses;
	}
	
	/**
	 * @param numberOfClasses the numberOfClasses to set
	 */
	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}
	
	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}
	
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}
	
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	/**
	 * @return the campus
	 */
	public String getCampus() {
		return campus;
	}
	
	/**
	 * @param campus the campus to set
	 */
	public void setCampus(String campus) {
		this.campus = campus;
	}
}
