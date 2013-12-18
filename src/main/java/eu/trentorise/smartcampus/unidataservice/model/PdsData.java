package eu.trentorise.smartcampus.unidataservice.model;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Informations about a "Percorso di Studi" (Path of study)
 */
public class PdsData {

	/**
	 * Id
	 */
	private String pdsId;
	
	/**
	 * Code
	 */
	private String pdsCod;
	
	public PdsData() {
	}

	public String getPdsId() {
		return pdsId;
	}

	public void setPdsId(String pdsId) {
		this.pdsId = pdsId;
	}

	public String getPdsCod() {
		return pdsCod;
	}

	public void setPdsCod(String pdsCod) {
		this.pdsCod = pdsCod;
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
