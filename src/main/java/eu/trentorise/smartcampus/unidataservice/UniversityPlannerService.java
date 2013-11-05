package eu.trentorise.smartcampus.unidataservice;

import java.util.List;

import eu.trentorise.smartcampus.network.JsonUtils;
import eu.trentorise.smartcampus.network.RemoteConnector;
import eu.trentorise.smartcampus.network.RemoteException;
import eu.trentorise.smartcampus.unidataservice.model.AdData;
import eu.trentorise.smartcampus.unidataservice.model.CdsData;
import eu.trentorise.smartcampus.unidataservice.model.FacoltaData;
import eu.trentorise.smartcampus.unidataservice.model.OperaStudent;
import eu.trentorise.smartcampus.unidataservice.model.StudentInfoData;
import eu.trentorise.smartcampus.unidataservice.model.StudentInfoExams;
import eu.trentorise.smartcampus.unidataservice.model.TimeTableData;

public class UniversityPlannerService {

	private String unidataServiceURL;

	private final static String GET_FACOLTA_DATA = "getfacolta/";
	private final static String GET_CDS_DATA = "getcds/";
	private final static String GET_AD_DATA = "getad/";
	private final static String GET_TIMETABLE_DATA = "gettimetable/";

	public UniversityPlannerService(String serverURL) {
		this.unidataServiceURL = serverURL;
		if (!unidataServiceURL.endsWith("/"))
			unidataServiceURL += '/';
	}

	public List<FacoltaData> getFacoltaData(String token) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_FACOLTA_DATA, token);
			return JsonUtils.toObjectList(json, FacoltaData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}
	
	public List<CdsData> getCdsData(String token, String facultyId) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_CDS_DATA + facultyId, token);
			return JsonUtils.toObjectList(json, CdsData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
	public List<AdData> getAdData(String token, String cdsId, String aaOrd, String aaOff) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_AD_DATA + cdsId + "/" + aaOrd + "/" + aaOff, token);
			return JsonUtils.toObjectList(json, AdData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
	public List<TimeTableData> getTimetable (String token, String cdsCod, String aaOrd, String aaOff, String pdsId, String pdsCod, String adCod, String domCod, String fatCod) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_TIMETABLE_DATA + cdsCod + "/" + aaOrd + "/" + aaOff + "/" + pdsId + "/" + pdsCod + "/" + adCod + "/" + domCod + "/" + fatCod, token);
			return JsonUtils.toObjectList(json, TimeTableData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
	
}
