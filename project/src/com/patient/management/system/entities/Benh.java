package com.patient.management.system.entities;

/**
 * * The Class Benh.
 * Class này lưu trữ tất cả các bệnh hiện có
 * @author dung.nguyen.trung
 */
public class Benh{
	
	/** The ten benh. */
	private String tenBenh;

	/**
	 * Gets the ten benh.
	 * 
	 * @return the ten benh
	 */
	public String getTenBenh() {
		return tenBenh;
	}

	/**
	 * Sets the ten benh.
	 * 
	 * @param tenBenh
	 *            the new ten benh
	 */
	public void setTenBenh(String tenBenh) {
		this.tenBenh = tenBenh;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Benh [tenBenh=" + tenBenh + "]";
	}

}
