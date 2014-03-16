/**
 * 
 */
package com.TCSNielsen.Hackathon.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author P Prasanna
 * 
 */
public class ProductDetails {
	private String upc;
	private String upcCode;
	private String manufacturerHigh;
	private String module;
	private String description;
	

	/**
	 * @return the upc
	 */
	public String getUpc() {
		return upc;
	}

	/**
	 * @param upc
	 *            the upc to set
	 */
	@JsonProperty(value="UPC")
	public void setUpc(String upc) {
		this.upc = upc;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	@JsonProperty(value="Description")
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module
	 *            the module to set
	 */
	@JsonProperty(value="Module")
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * @return the manufacturer_HIGH
	 */
	public String getManufacturerHigh() {
		return manufacturerHigh;
	}

	/**
	 * @param manufacturer_HIGH
	 *            the manufacturer_HIGH to set
	 */
	@JsonProperty(value="MANUFACTURER_HIGH")
	public void setManufacturerHigh(String manufacturerHigh) {
		this.manufacturerHigh = manufacturerHigh;
	}

	/**
	 * @return the upcCode
	 */
	public String getUpcCode() {
		return upcCode;
	}

	/**
	 * @param upcCode the upcCode to set
	 */
	@JsonProperty(value="UPC_CODE")
	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

}
