package eu.trentorise.smartcampus.unidataservice.model;


public class StudentInfoExam {

	private String id;
	private String cod;
	private String name;
	private String result;
	private boolean lode;
	private String weight;
	private long date;
	
	public StudentInfoExam () {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public boolean isLode() {
		return lode;
	}

	public void setLode(boolean lode) {
		this.lode = lode;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	
}
