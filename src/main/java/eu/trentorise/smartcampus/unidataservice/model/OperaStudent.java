package eu.trentorise.smartcampus.unidataservice.model;

import java.util.List;

/**
 * Informations about a student Opera Universitaria card
 */
public class OperaStudent {

	/**
	 * Student Id for the Opera Universitaria DB
	 */
	private String idGiada;
	private String name;
	private String surname;
	
	/**
	 * Id of the Opera Universitaria card
	 */
	private String idCard;
	
	/**
	 * Money spent
	 */
	private String spent;
	
	/**
	 * Money remaining
	 */
	private String remaining;
	
	/**
	 * List of payments
	 */
	private List<OperaPayment> payments;
	
	public OperaStudent() {
	}	

	public String getIdGiada() {
		return idGiada;
	}

	public void setIdGiada(String idGiada) {
		this.idGiada = idGiada;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSpent() {
		return spent;
	}

	public void setSpent(String spent) {
		this.spent = spent;
	}

	public String getRemaining() {
		return remaining;
	}

	public void setRemaining(String remaining) {
		this.remaining = remaining;
	}

	public List<OperaPayment> getPayments() {
		return payments;
	}

	public void setPayments(List<OperaPayment> payments) {
		this.payments = payments;
	}

		
}
