package com.richa.model;

/**
 * @author Richa
 */
public class Result {

	//Values to map the rapid miner values
	String classNbr;
	String name;
	String facilityId;
	String startTime;
	String endTime;
	String courseId;
	String classSection;
	String Institute;
	String acadGroup;
	String subject;
	String catalogNbr;
	String acadCareer;
	String description;
	String enrlStatus;
	String enrlCapacity;
	String enrolTotal;
	String waitTotal;
	String acadOrg;
	String campus;
	String lmsGpId;
	String isMon;
	String isTue;
	String isWed;
	String isThu;
	String isFri;
	String isSat;
	String isSun;
	String startDate;
	String endDate;
	String stndMtgPat;
	String sessionCode;
	String empId;
	String label;
	String className;

	//Constructor to map the values
	public Result(String classNbr, String name, String facilityId, String startTime, String endTime, String courseId,
			String classSection, String Institute, String acadGroup, String Subject, String catalogNbr,
			String acadCareer, String description, String enrlStatus, String enrlCapacity, String enrolTotal, String waitTotal,
			String acadOrg, String campus, String lmsGpId, String isMon, String isTue, String isWed, String isThu, String isFri,
			String isSat, String isSun, String startDate, String endDate, String stndMtgPat, String sessionCode, String empId,
			String label, String className) {

		this.classNbr = classNbr;
		this.name = name;
		this.facilityId = facilityId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.courseId = courseId;
		this.classSection = classSection;
		this.Institute = Institute;
		this.acadGroup = acadGroup;
		this.subject = Subject;
		this.catalogNbr = catalogNbr;
		this.acadCareer = acadCareer;
		this.description = description;
		this.enrlStatus = enrlStatus;
		this.enrlCapacity = enrlCapacity;
		this.enrolTotal = enrolTotal;
		this.waitTotal = waitTotal;
		this.acadOrg = acadOrg;
		this.campus = campus;
		this.lmsGpId = lmsGpId;
		this.isMon = isMon;
		this.isTue = isTue;
		this.isWed = isWed;
		this.isThu = isThu;
		this.isFri = isFri;
		this.isSat = isSat;
		this.isSun = isSun;
		this.startDate = startDate;
		this.endDate = endDate;
		this.stndMtgPat = stndMtgPat;
		this.sessionCode = sessionCode;
		this.empId = empId;
		this.label = label;
		this.className = className;

	}

	/**
	 * @return the classNbr
	 */
	public String getClassNbr() {
		return classNbr;
	}

	/**
	 * @param classNbr
	 *            the classNbr to set
	 */
	public void setClassNbr(String classNbr) {
		this.classNbr = classNbr;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the facilityId
	 */
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * @param facilityId
	 *            the facilityId to set
	 */
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
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
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId
	 *            the courseId to set
	 */
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the classSection
	 */
	public String getClassSection() {
		return classSection;
	}

	/**
	 * @param classSection
	 *            the classSection to set
	 */
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}

	/**
	 * @return the institute
	 */
	public String getInstitute() {
		return Institute;
	}

	/**
	 * @param institute
	 *            the institute to set
	 */
	public void setInstitute(String institute) {
		Institute = institute;
	}

	/**
	 * @return the acadGroup
	 */
	public String getAcadGroup() {
		return acadGroup;
	}

	/**
	 * @param acadGroup
	 *            the acadGroup to set
	 */
	public void setAcadGroup(String acadGroup) {
		this.acadGroup = acadGroup;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the catalogNbr
	 */
	public String getCatalogNbr() {
		return catalogNbr;
	}

	/**
	 * @param catalogNbr
	 *            the catalogNbr to set
	 */
	public void setCatalogNbr(String catalogNbr) {
		this.catalogNbr = catalogNbr;
	}

	/**
	 * @return the acadCareer
	 */
	public String getAcadCareer() {
		return acadCareer;
	}

	/**
	 * @param acadCareer
	 *            the acadCareer to set
	 */
	public void setAcadCareer(String acadCareer) {
		this.acadCareer = acadCareer;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the enrlStatus
	 */
	public String getEnrlStatus() {
		return enrlStatus;
	}

	/**
	 * @param enrlStatus
	 *            the enrlStatus to set
	 */
	public void setEnrlStatus(String enrlStatus) {
		this.enrlStatus = enrlStatus;
	}

	/**
	 * @return the enrlCapacity
	 */
	public String getEnrlCapacity() {
		return enrlCapacity;
	}

	/**
	 * @param enrlCapacity
	 *            the enrlCapacity to set
	 */
	public void setEnrlCapacity(String enrlCapacity) {
		this.enrlCapacity = enrlCapacity;
	}

	/**
	 * @return the enrolTotal
	 */
	public String getEnrolTotal() {
		return enrolTotal;
	}

	/**
	 * @param enrolTotal
	 *            the enrolTotal to set
	 */
	public void setEnrolTotal(String enrolTotal) {
		this.enrolTotal = enrolTotal;
	}

	/**
	 * @return the waitTotal
	 */
	public String getWaitTotal() {
		return waitTotal;
	}

	/**
	 * @param waitTotal
	 *            the waitTotal to set
	 */
	public void setWaitTotal(String waitTotal) {
		this.waitTotal = waitTotal;
	}

	/**
	 * @return the acadOrg
	 */
	public String getAcadOrg() {
		return acadOrg;
	}

	/**
	 * @param acadOrg
	 *            the acadOrg to set
	 */
	public void setAcadOrg(String acadOrg) {
		this.acadOrg = acadOrg;
	}

	/**
	 * @return the campus
	 */
	public String getCampus() {
		return campus;
	}

	/**
	 * @param campus
	 *            the campus to set
	 */
	public void setCampus(String campus) {
		this.campus = campus;
	}

	/**
	 * @return the lmsGpId
	 */
	public String getLmsGpId() {
		return lmsGpId;
	}

	/**
	 * @param lmsGpId
	 *            the lmsGpId to set
	 */
	public void setLmsGpId(String lmsGpId) {
		this.lmsGpId = lmsGpId;
	}

	/**
	 * @return the isMon
	 */
	public String getIsMon() {
		return isMon;
	}

	/**
	 * @param isMon
	 *            the isMon to set
	 */
	public void setIsMon(String isMon) {
		this.isMon = isMon;
	}

	/**
	 * @return the isTue
	 */
	public String getIsTue() {
		return isTue;
	}

	/**
	 * @param isTue
	 *            the isTue to set
	 */
	public void setIsTue(String isTue) {
		this.isTue = isTue;
	}

	/**
	 * @return the isWed
	 */
	public String getIsWed() {
		return isWed;
	}

	/**
	 * @param isWed
	 *            the isWed to set
	 */
	public void setIsWed(String isWed) {
		this.isWed = isWed;
	}

	/**
	 * @return the isThu
	 */
	public String getIsThu() {
		return isThu;
	}

	/**
	 * @param isThu
	 *            the isThu to set
	 */
	public void setIsThu(String isThu) {
		this.isThu = isThu;
	}

	/**
	 * @return the isFri
	 */
	public String getIsFri() {
		return isFri;
	}

	/**
	 * @param isFri
	 *            the isFri to set
	 */
	public void setIsFri(String isFri) {
		this.isFri = isFri;
	}

	/**
	 * @return the isSat
	 */
	public String getIsSat() {
		return isSat;
	}

	/**
	 * @param isSat
	 *            the isSat to set
	 */
	public void setIsSat(String isSat) {
		this.isSat = isSat;
	}

	/**
	 * @return the isSun
	 */
	public String getIsSun() {
		return isSun;
	}

	/**
	 * @param isSun
	 *            the isSun to set
	 */
	public void setIsSun(String isSun) {
		this.isSun = isSun;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the stndMtgPat
	 */
	public String getStndMtgPat() {
		return stndMtgPat;
	}

	/**
	 * @param stndMtgPat
	 *            the stndMtgPat to set
	 */
	public void setStndMtgPat(String stndMtgPat) {
		this.stndMtgPat = stndMtgPat;
	}

	/**
	 * @return the sessionCode
	 */
	public String getSessionCode() {
		return sessionCode;
	}

	/**
	 * @param sessionCode
	 *            the sessionCode to set
	 */
	public void setSessionCode(String sessionCode) {
		this.sessionCode = sessionCode;
	}

	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the class
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className
	 *           
	 */
	public void setClassName(String className) {
		this.className = className;
	}
}
