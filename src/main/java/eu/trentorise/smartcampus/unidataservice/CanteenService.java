package eu.trentorise.smartcampus.unidataservice;

import java.util.List;

import eu.trentorise.smartcampus.network.JsonUtils;
import eu.trentorise.smartcampus.network.RemoteConnector;
import eu.trentorise.smartcampus.network.RemoteException;
import eu.trentorise.smartcampus.unidataservice.model.CanteenOpening;
import eu.trentorise.smartcampus.unidataservice.model.Menu;

/**
 * Class to get information about the University canteens
 */
public class CanteenService {

	private String unidataServiceURL;

	private final static String GET_OPENING = "data/getopening/";
	private final static String GET_MENU = "data/getmenu/";

	public CanteenService(String serverURL) {
		this.unidataServiceURL = serverURL;
		if (!unidataServiceURL.endsWith("/"))
			unidataServiceURL += '/';
	}
	
	/**
	 * 
	 * @param token a client or user token
	 * @return a list of canteen openings
	 * @throws SecurityException
	 * @throws UnidataServiceException
	 */
	public List<CanteenOpening> getOpening(String token) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_OPENING, token);
			return JsonUtils.toObjectList(json, CanteenOpening.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}
	
	/**
	 * 
	 * @param token a client or user token
	 * @param from start date (in yyyy-mm-dd format)
	 * @param to end date (in yyyy-mm-dd format)
	 * @return
	 * @throws SecurityException
	 * @throws UnidataServiceException
	 */
	public List<Menu> getMenu(String token, String from, String to) throws SecurityException, UnidataServiceException {
		try {
			String json = RemoteConnector.getJSON(unidataServiceURL, GET_MENU + from + "/" + to, token);
			return JsonUtils.toObjectList(json, Menu.class);
		} catch (RemoteException e) {
			throw new UnidataServiceException(e);
		}
	}	
	
}
