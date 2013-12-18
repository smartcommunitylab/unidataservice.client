package eu.trentorise.smartcampus.unidataservice.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Informations about a "Corso di studi" (Course of study)
 */
public class CdsData {

	/**
	 * Id
	 */
	private String cdsId;
	
	/**
	 * Code
	 */
	private String cdsCod;
	
	/**
	 * Faculty Id
	 */
	private String facId;
	
	/**
	 * Description
	 */
	private String description;
	
	/**
	 * Duration (in years)
	 */
	private String durata;
	
	/**
	 * Anno di Ordinamento (University regulation year)
	 */
	private String aaOrd;
	
	/**
	 * List of paths of study
	 */
	private List<PdsData> pds;
	
	public CdsData() {
		pds = new ArrayList<PdsData>();
	}

	public String getCdsId() {
		return cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
	}

	public String getCdsCod() {
		return cdsCod;
	}

	public void setCdsCod(String cdsCod) {
		this.cdsCod = cdsCod;
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

	public String getDurata() {
		return durata;
	}

	public void setDurata(String durata) {
		this.durata = durata;
	}

	public String getAaOrd() {
		return aaOrd;
	}

	public void setAaOrd(String aaOrd) {
		this.aaOrd = aaOrd;
	}

	public List<PdsData> getPds() {
		return pds;
	}

	public void setPds(List<PdsData> pds) {
		this.pds = pds;
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
