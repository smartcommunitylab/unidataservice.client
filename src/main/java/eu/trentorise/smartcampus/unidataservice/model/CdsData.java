package eu.trentorise.smartcampus.unidataservice.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class CdsData {

	private String cdsId;
	private String cdsCod;
	private String facId;
	private String description;
	private String durata;
	private String aaOrd;
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
