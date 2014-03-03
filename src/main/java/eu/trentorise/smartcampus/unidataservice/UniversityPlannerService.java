package eu.trentorise.smartcampus.unidataservice;

import java.util.List;

import eu.trentorise.smartcampus.network.JsonUtils;
import eu.trentorise.smartcampus.network.RemoteConnector;
import eu.trentorise.smartcampus.network.RemoteException;
import eu.trentorise.smartcampus.unidataservice.model.AdData;
import eu.trentorise.smartcampus.unidataservice.model.CalendarCdsData;
import eu.trentorise.smartcampus.unidataservice.model.CdsData;
import eu.trentorise.smartcampus.unidataservice.model.FacoltaData;
import eu.trentorise.smartcampus.unidataservice.model.OperaStudent;
import eu.trentorise.smartcampus.unidataservice.model.StudentInfoData;
import eu.trentorise.smartcampus.unidataservice.model.StudentInfoExams;
import eu.trentorise.smartcampus.unidataservice.model.TimeTableData;

/**
 * Class to obtain informations about courses and their timetables.
 * To get a timetable for a course, one must call the various methods one after another to gatherer the needed parameters for getTimetable.
 * So you must get a List of FacoltaData, then a List of CdsData corresponding to the FacoltaData, then a List of AdData and finally a List of TimeTableData
 */
public class UniversityPlannerService {

	private String unidataServiceURL;

	private final static String GET_FACOLTA_DATA = "getfacolta/";
	private final static String GET_CDS_DATA = "getcds/";
	private final static String GET_AD_DATA = "getad/";
	private final static String GET_TIMETABLE_DATA = "gettimetable/";
	private final static String GET_CDS_CALENDAR = "getcdscalendar/";

	public UniversityPlannerService(String serverURL) {
		this.unidataServiceURL = serverURL;
		if (!unidataServiceURL.endsWith("/"))
			unidataServiceURL += '/';
	}

	/**
	 * Return the list of unitn "Facolta'"
	 * @param token a client token
	 * @return
	 * @throws SecurityException
	 * @throws UnidataServiceException
	 */
	public List<FacoltaData> getFacoltaData(String token) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_FACOLTA_DATA, token);
			return JsonUtils.toObjectList(json, FacoltaData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}
	
	/**
	 * Return the list of "Corsi di Studio" for a particular "Facolta'"
	 * @param token a client token
	 * @param facultyId the "Facolta'" id
	 * @return
	 * @throws SecurityException
	 * @throws UnidataServiceException
	 */
	public List<CdsData> getCdsData(String token, String facultyId) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_CDS_DATA + facultyId, token);
			return JsonUtils.toObjectList(json, CdsData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
	/**
	 * Return the list of "Attivita' Didattiche" (courses) for a particular "Corso di Studio'"
	 * @param token a client token
	 * @param cdsId the "Corso di Studio'" id
	 * @param aaOrd the "Anno Accademico Ordinamento"
	 * @param aaOff the "Anno Accademico Offerta"
	 * @return
	 * @throws SecurityException
	 * @throws UnidataServiceException
	 */
	public List<AdData> getAdData(String token, String cdsId, String aaOrd, String aaOff) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_AD_DATA + cdsId + "/" + aaOrd + "/" + aaOff, token);
			return JsonUtils.toObjectList(json, AdData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
	/**
	 * Return the timetable for an "Attivita' Didattica"
	 * @param token a client token
	 * @param cdsCod the "Corso di Studio'" code
	 * @param aaOrd the "Anno Accademico Ordinamento"
	 * @param aaOff the "Anno Accademico Offerta"
	 * @param pdsId the "Percorso di Studi" id
	 * @param pdsCod the "Percorso di Studi" code
	 * @param adCod the "Attivita' Didattica" cod
	 * @param domCod a code to be used together with fatCod to define an "Attivita' Didattica" partitioning
	 * @param fatCod a code to be used together with domCod to define an "Attivita' Didattica" partitioning
	 * @return
	 * @throws SecurityException
	 * @throws UnidataServiceException
	 */
	public List<TimeTableData> getTimetable (String token, String cdsCod, String aaOrd, String aaOff, String pdsId, String pdsCod, String adCod, String domCod, String fatCod) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_TIMETABLE_DATA + cdsCod + "/" + aaOrd + "/" + aaOff + "/" + pdsId + "/" + pdsCod + "/" + adCod + "/" + domCod + "/" + fatCod, token);
			return JsonUtils.toObjectList(json, TimeTableData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
	/**
	 * Return a weekly timetable for a a particular "Corso di Studio'" and year of course
	 * @param token a client token
	 * @param cdsId the "Corso di Studi" id
	 * @param year the year of course
	 * @return
	 * @throws SecurityException
	 * @throws UnidataServiceException
	 */
	public List<CalendarCdsData> getCdsCalendar (String token, String cdsId, String year) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_CDS_CALENDAR + cdsId + "/" + year, token);
			return JsonUtils.toObjectList(json, CalendarCdsData.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
	
}
