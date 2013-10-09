package eu.trentorise.smartcampus.unidataservice;

import eu.trentorise.smartcampus.network.JsonUtils;
import eu.trentorise.smartcampus.network.RemoteConnector;
import eu.trentorise.smartcampus.network.RemoteException;
import eu.trentorise.smartcampus.unidataservice.model.OperaStudent;
import eu.trentorise.smartcampus.unidataservice.model.StudentInfoData;
import eu.trentorise.smartcampus.unidataservice.model.StudentInfoExams;

public class StudentInfoService {

	private String unidataServiceURL;

	private final static String GET_STUDENT_DATA = "getstudentdata/";
	private final static String GET_STUDENT_EXAMS = "getstudentexams/";
	private final static String GET_OPERACARD = "getoperacard/";

	public StudentInfoService(String serverURL) {
		this.unidataServiceURL = serverURL;
		if (!unidataServiceURL.endsWith("/"))
			unidataServiceURL += '/';
	}

	public StudentInfoData getStudentData(String token) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_STUDENT_DATA, token);
			return JsonUtils.toObject(json, StudentInfoData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}
	
	public StudentInfoData getStudentData(String token, String userId) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_STUDENT_DATA + userId, token);
			return JsonUtils.toObject(json, StudentInfoData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
	public StudentInfoExams getStudentExams(String token) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_STUDENT_EXAMS, token);
			return JsonUtils.toObject(json, StudentInfoExams.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
	public StudentInfoExams getStudentExams(String token, String userId) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_STUDENT_EXAMS + userId, token);
			return JsonUtils.toObject(json, StudentInfoExams.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}		
	
	public OperaStudent getOperaCard(String token) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_OPERACARD, token);
			return JsonUtils.toObject(json, OperaStudent.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}		
	
	public OperaStudent getOperaCard(String token, String userId) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_OPERACARD + userId, token);
			return JsonUtils.toObject(json, OperaStudent.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}			
	
	
	

}
