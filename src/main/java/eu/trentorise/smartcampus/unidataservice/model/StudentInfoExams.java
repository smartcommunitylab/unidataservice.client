package eu.trentorise.smartcampus.unidataservice.model;

import java.util.List;

public class StudentInfoExams {

	private String idAda;
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
