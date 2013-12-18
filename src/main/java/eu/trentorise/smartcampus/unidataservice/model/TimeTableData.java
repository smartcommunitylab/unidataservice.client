package eu.trentorise.smartcampus.unidataservice.model;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Time slot for a course
 */
public class TimeTableData {

	/**
	 * Type of event, for example "Lezione"
	 */
	private String type;
	private String date;
	
	/**
	 * Start hour
	 */
	private String from;
	
	/**
	 * End hour
	 */
	private String to;
	private String room;
	private String teacher;
	
	public TimeTableData() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
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
