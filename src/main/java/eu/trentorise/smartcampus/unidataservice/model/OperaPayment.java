package eu.trentorise.smartcampus.unidataservice.model;


/**
 * Informations about a payment in the University canteens
 */
public class OperaPayment {

	/**
	 * Date of payment
	 */
	private String paymentDate;
	
	/**
	 * Code of the canteen
	 */
	private String canteenCode;
	
	/**
	 * Description of the canteen
	 */
	private String canteenDescription;
	private String productDescription;
	
	/**
	 * Type of the product, for example "SNACK 1"
	 */
	private String productType;
	
	/**
	 * Total paid
	 */
	private String totalPayment;
	
	/**
	 * Price of the product
	 */
	private String productPrice;
	
	public OperaPayment() {
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getCanteenCode() {
		return canteenCode;
	}

	public void setCanteenCode(String canteenCode) {
		this.canteenCode = canteenCode;
	}

	public String getCanteenDescription() {
		return canteenDescription;
	}

	public void setCanteenDescription(String canteenDescription) {
		this.canteenDescription = canteenDescription;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(String totalPayment) {
		this.totalPayment = totalPayment;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

		
	
	
}
