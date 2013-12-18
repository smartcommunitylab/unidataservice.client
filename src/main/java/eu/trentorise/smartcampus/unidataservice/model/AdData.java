package eu.trentorise.smartcampus.unidataservice.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Informations about an "Attivita' Didattica" (University course)
 */
public class AdData {

	/**
	 * Id
	 */
	private String adId;
	
	/**
	 * Code
	 */
	private String adcod;
	
	/**
	 * Description
	 */
	private String description;
	
	/**
	 * To be used together with domPart for course partitioning
	 */
	private List<String> fatPart;
	
	/**
	 * To be used together with fatPart for course partitioning
	 */	
	private List<String> domPart;
	
	public AdData() {
		fatPart = new ArrayList<String>();
		domPart = new ArrayList<String>();
	}

	public String getAdId() {
		return adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getAdcod() {
		return adcod;
	}

	public void setAdcod(String adcod) {
		this.adcod = adcod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getFatPart() {
		return fatPart;
	}

	public void setFatPart(List<String> fatPart) {
		this.fatPart = fatPart;
	}

	public List<String> getDomPart() {
		return domPart;
	}

	public void setDomPart(List<String> domPart) {
		this.domPart = domPart;
	}
	
	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		try {
		return mapper.writeValueAsString(this);
		} catch (Exception e) {
			return "";
		}
	}	
	
	
}
