package eu.trentorise.smartcampus.unidataservice.model;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Informations about a "Facolta'" (Faculty)
 */
public class FacoltaData {

	/**
	 * Id
	 */
	private String facId;
	
	/**
	 * Description
	 */
	private String description;
	
	public FacoltaData() {
	}

	public String getFacId() {
		return facId;
	}

	public void setFacId(String facId) {
		this.facId = facId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
