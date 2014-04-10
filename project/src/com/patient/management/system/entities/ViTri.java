package com.patient.management.system.entities;

/**
 * * The Class ViTri.
 * Class này lưu trữ thông tin về vị trí mà bệnh nhân được khám bệnh
 * @author dung.nguyen.trung
 */
public class ViTri {
	
	/** The ten vi tri. */
	private String tenViTri;

	/**
	 * Gets the ten vi tri.
	 * 
	 * @return the ten vi tri
	 */
	public String getTenViTri() {
		return tenViTri;
	}

	/**
	 * Sets the ten vi tri.
	 * 
	 * @param tenViTri
	 *            the new ten vi tri
	 */
	public void setTenViTri(String tenViTri) {
		this.tenViTri = tenViTri;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ViTri [tenViTri=" + tenViTri + "]";
	}

}
