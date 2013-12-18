package eu.trentorise.smartcampus.unidataservice.model;

import java.util.List;

/**
 * List of exams of a student
 */
public class StudentInfoExams {

	/**
	 * Student Id for the University DB
	 */
	private String idAda;
	
	/**
	 * List of exams
	 */
	private List<StudentInfoExam> exams;
	
	public StudentInfoExams() {
	}

	public String getIdAda() {
		return idAda;
	}

	public void setIdAda(String idAda) {
		this.idAda = idAda;
	}

	public List<StudentInfoExam> getExams() {
		return exams;
	}

	public void setExams(List<StudentInfoExam> exams) {
		this.exams = exams;
	}
	
	
	
}
